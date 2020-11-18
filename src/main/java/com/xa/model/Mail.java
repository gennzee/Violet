package com.xa.model;

import javax.mail.Flags;
import java.util.Date;

/**
 * Created by anhnx on 25/07/2020.
 */
public class Mail {

    private int id;
    private String from;
    private String subject;
    private String message;
    private Date receivedDate;
    private String flags;

    public Mail(){}

    public Mail(int id, String from, String subject, String message, Date receivedDate, String flags) {
        this.id = id;
        this.from = from;
        this.subject = subject;
        this.message = message;
        this.receivedDate = receivedDate;
        this.flags = flags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(Date receivedDate) {
        this.receivedDate = receivedDate;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }
}
