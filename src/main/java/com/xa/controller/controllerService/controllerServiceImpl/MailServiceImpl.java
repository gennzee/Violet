package com.xa.controller.controllerService.controllerServiceImpl;

import com.xa.controller.controllerService.MailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by anhnx on 25/07/2020.
 */
@Service
public class MailServiceImpl implements MailService {

    private static Logger logger = LoggerFactory.getLogger(MailServiceImpl.class);

    @Autowired
    private ApplicationContext context;

    @Override
    public void sendSimpleMail(String from, String to, String subject, String content) {
        SimpleMailMessage messagess = new SimpleMailMessage();
        messagess.setFrom(from);
        messagess.setTo(to);
        messagess.setSubject(subject);
        messagess.setText(content);
        // Send Message!
        this.context.getBean(JavaMailSender.class).send(messagess);
        logger.info("Sent mail to {} successfully from {}.", to, from);
    }

}
