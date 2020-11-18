package com.xa.model;

import javax.persistence.*;

/**
 * Created by anhnx on 20/05/2020.
 */
@Entity
@Table(name = "aboutus")
public class AboutUs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String content;

    public AboutUs() {
    }

    public AboutUs(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
