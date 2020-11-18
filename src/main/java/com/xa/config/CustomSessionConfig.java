package com.xa.config;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by anhnx on 14/05/2020.
 */
@WebListener
public class CustomSessionConfig implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("-- Đã tạo session mới --");
        System.out.println("Session id: " + se.getSession().getId());
        se.getSession().setMaxInactiveInterval(900);//in seconds
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("-- Đã xóa session --");
        System.out.println("Session id: " + se.getSession().getId());
    }

}
