package com.unimoni.unimonirateengin.entity.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RateProvider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "uiid")
    long id;
    private String name;
    private String descryption;

    public RateProvider() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescryption() {
        return descryption;
    }

    public void setDescryption(String descryption) {
        this.descryption = descryption;
    }
}
