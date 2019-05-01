package com.unimoni.unimonirateengin.entity.core;

import com.unimoni.unimonirateengin.model.core.request.CurrencyRequestUI;
import com.unimoni.unimonirateengin.model.core.response.CurrencyResponseUI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "uiid")
    long id;
    private String code;
    private String name;
    private String descryption;
    private boolean isOperation;
    private String status;

    public Currency() {
    }

    public Currency(CurrencyRequestUI currencyRequestUI) {
        this.name=currencyRequestUI.getName();
        this.code=currencyRequestUI.getCode();
        this.descryption=currencyRequestUI.getDesc();
        this.isOperation=currencyRequestUI.isOperation();
        this.status=currencyRequestUI.getStatus();
    }

    public Currency(CurrencyResponseUI currencyResponseUI) {
        this.id=currencyResponseUI.getId();
        this.name=currencyResponseUI.getName();
        this.code=currencyResponseUI.getCode();
        this.descryption=currencyResponseUI.getDesc();
        this.isOperation=currencyResponseUI.isOperation();
        this.status=currencyResponseUI.getStatus();
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

    public boolean isOperation() {
        return isOperation;
    }

    public void setOperation(boolean operation) {
        isOperation = operation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
