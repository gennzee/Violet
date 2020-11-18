package com.xa.controller.controllerService;

/**
 * Created by anhnx on 25/07/2020.
 */
public interface MailService {

    void sendSimpleMail(String from, String to, String subject, String content);

}
