package com.unimoni.unimonirateengin.entity.core;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyFrequency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String currencyId;
    private String freq;

    public CurrencyFrequency(String currencyId, String freq) {
        this.currencyId = currencyId;
        this.freq = freq;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }
}
