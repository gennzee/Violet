package com.xa.controller.shop.impl;

import com.xa.controller.controllerService.CategoriesService;
import com.xa.controller.controllerService.NewsService;
import com.xa.controller.controllerService.shopService;
import com.xa.controller.shop.indexApi;
import com.xa.service.InitializeSession;
import com.xa.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.*;

import static com.xa.service.ConstVariables.*;

@Component
public class indexController implements indexApi {

    @Autowired
    private InitializeSession initializeSession;

    @Autowired
    private CategoriesService categoriesService;

    @Autowired
    private shopService shopService;

    @Autowired
    private NewsService newsService;

    @Autowired
    private ApplicationContext context;

    @Override
    public String index(HttpSession session, ModelMap modelMap){
        initializeSession.initializeSession(session);

        List<News> newsList = newsService.findAll(PageRequest.of(0, 3));
        modelMap.addAttribute("newsList", newsList);

        List<Products> productsList = shopService.initIndex(session, modelMap, PageRequest.of(0, 8));
        modelMap.addAttribute("listProducts", productsList);
        categoriesService.loadSizeAndColorList(productsList, modelMap);

        File file = new File("/");
        System.out.println("free space left on your vps (disk)" + file.getFreeSpace() / 1000000000.00 + " mb");

//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(MY_EMAIL);
//        message.setTo(FRIEND_EMAIL);
//        message.setSubject("Test Simple Email");
//        message.setText("Hello, Im testing Simple Email");
//        // Send Message!
//        this.context.getBean(JavaMailSender.class).send(message);
        try{
            Properties properties  = System.getProperties();
            properties.put("mail.pop3.host", MY_HOST);
            properties.put("mail.pop3.port", "995");
            properties.put("mail.pop3.starttls.enable", "true");
            Session emailSession = Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");
            store.connect(MY_HOST, MY_USER, MY_PASSWORD);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " +getMessageContent(message));
            }
            //close the store and folder objects
            emailFolder.close(false);
            store.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return cozaShopPage+"index";
    }

    private String getMessageContent(Message message) throws MessagingException {
        try {
            Object content = message.getContent();
            if (content instanceof Multipart) {
                StringBuffer messageContent = new StringBuffer();
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
            e.printStackTrace();
        }
        return "";
    }

}
