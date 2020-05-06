package com.xa.model;

import javax.persistence.*;

/**
 * Created by anhnx on 06/05/2020.
 */
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    @Column
    private String name;

    public Categories() {
    }

    public Categories(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
