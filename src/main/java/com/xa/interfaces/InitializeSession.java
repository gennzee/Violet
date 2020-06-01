package com.xa.interfaces;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * Created by anhnx on 01/06/2020.
 */
@Component
public interface InitializeSession {

    public void initializeSession(HttpSession session);

}
