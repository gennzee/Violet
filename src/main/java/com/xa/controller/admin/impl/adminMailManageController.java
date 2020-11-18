package com.xa.controller.admin.impl;

import com.sun.mail.util.MailSSLSocketFactory;
import com.xa.controller.admin.adminMailManageApi;
import com.xa.model.Mail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.mail.*;
import javax.mail.internet.MimeUtility;
import javax.mail.search.FlagTerm;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.xa.service.ConstVariables.*;

/**
 * Created by anhnx on 25/07/2020.
 */
@Component
public class adminMailManageController implements adminMailManageApi {

    private static Logger logger = LoggerFactory.getLogger(adminMailManageController.class);

    private static final String ENCODED_PART_REGEX_PATTERN="=\\?([^?]+)\\?([^?]+)\\?([^?]+)\\?=";

    @Override
    public String mailManage(ModelMap modelMap) {
        List<Mail> mailList = new ArrayList<>();
        try{
            Properties properties  = System.getProperties();
            properties.put("mail.imaps.host", MY_HOST);
            properties.put("mail.imaps.port", IMAPS_PORT);
            properties.put("mail.imaps.starttls.enable", "true");
            MailSSLSocketFactory socketFactory= new MailSSLSocketFactory();
            socketFactory.setTrustAllHosts(true);
            properties.put("mail.imaps.ssl.socketFactory", socketFactory);
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore(IMAPS);
            store.connect(MY_HOST, MY_USER, MY_PASSWORD);

            //create the folder object and open it
            Folder emailFolder = store.getFolder(INBOX_FOLDER);
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.search(new FlagTerm(new Flags(Flags.Flag.DELETED), false));
            logger.info("messages.length --- {}", messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                logger.info("---------------------------------");
                logger.info("Email Number {}", message.getMessageNumber());
                logger.info("Subject: {}", message.getSubject());
                logger.info("From: {}", decodeMimeText(message.getFrom()[0].toString()));
                logger.info("Text: {}", getMessageContent(message));

                Mail mail = new Mail(message.getMessageNumber(), decodeMimeText(message.getFrom()[0].toString()), message.getSubject(), getMessageContent(message), message.getReceivedDate(), formatEmailFlags(message.getFlags().toString()));
                mailList.add(mail);
            }
            //close the store and folder objects
            emailFolder.close(false);
            store.close();
        }catch (Exception e){
            logger.error("Error when getting mails", e);
        }

        mailList.sort(Comparator.comparingInt(Mail::getId).reversed());
        modelMap.addAttribute("mailList", mailList);
        return adminPage + "mailManage";
    }

    public String formatEmailFlags(String flags){
        String vnFlg = "";
        switch (flags){
            case "":
                vnFlg = "Mới";
                break;
            case "\\Seen":
                vnFlg = "Đã xem";
                break;
            case "\\Answered":
                vnFlg = "Đã trả lời";
                break;
            case "\\Deleted":
                vnFlg = "Đã xóa";
                break;
            case "\\Draft":
                vnFlg = "Bản nháp";
                break;
            case "\\Flagged":
                vnFlg = "Đã gắn cờ";
                break;
            case "\\Recent":
                vnFlg = "Mới nhận";
                break;
        }
        return vnFlg;
    }

    @Override
    public String deleteMail(int id) {
        try {
            Properties properties  = System.getProperties();
            properties.put("mail.imaps.host", MY_HOST);
            properties.put("mail.imaps.port", IMAPS_PORT);
            properties.put("mail.imaps.starttls.enable", "true");
            MailSSLSocketFactory socketFactory= new MailSSLSocketFactory();
            socketFactory.setTrustAllHosts(true);
            properties.put("mail.imaps.ssl.socketFactory", socketFactory);
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore(IMAPS);
            store.connect(MY_HOST, MY_USER, MY_PASSWORD);
            //create the folder object and open it
            Folder emailFolder = store.getFolder(INBOX_FOLDER);
            emailFolder.open(Folder.READ_WRITE);
            //get message from message's id
            Message message = emailFolder.getMessage(id);
            //delete message by id
            message.setFlag(Flags.Flag.DELETED, true);
            logger.info("Deleted email id {}", message.getMessageNumber());
            //close
            emailFolder.close(false);
            store.close();
        }catch (Exception e){
            logger.error("Error when deleting email", e);
        }
        return "redirect:/mailManagement";
    }

    private String getMessageContent(Message message) throws MessagingException {
        try {
            Object content = message.getContent();
            if (content instanceof Multipart) {
                StringBuilder messageContent = new StringBuilder();
                Multipart multipart = (Multipart) content;
                for (int i = 0; i < multipart.getCount(); i++) {
                    Part part = multipart.getBodyPart(i);
                    if (part.isMimeType("text/plain")) {
                        messageContent.append(part.getContent().toString());
                    }
                }
                return messageContent.toString();
            }
            return content.toString();

        } catch (Exception e) {
            logger.error("Error while formatting message", e);
        }
        return "";
    }

    private String decodeMimeText(String s) {
        Pattern pattern = Pattern.compile(ENCODED_PART_REGEX_PATTERN);
        Matcher m = pattern.matcher(s);
        ArrayList<String> encodedParts = new ArrayList<>();

        while(m.find()) {
            encodedParts.add(m.group(0));
        }
        if(!encodedParts.isEmpty()) {
            try {
                for(String encoded : encodedParts) {
                    s = s.replace(encoded, MimeUtility.decodeText(encoded));
                }
                return s;
            } catch(Exception e) {
                return s;
            }
        }
        else
            return s;
    }

}
