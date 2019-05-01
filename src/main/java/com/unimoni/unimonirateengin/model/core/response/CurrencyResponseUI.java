package com.unimoni.unimonirateengin.model.core.response;

import com.unimoni.unimonirateengin.entity.core.Currency;
import org.springframework.stereotype.Component;

@Component
public class CurrencyResponseUI {

    private Long id;
    private String name;
    private String code;
    private String desc;
    private boolean isOperation;
    private String status;

    public CurrencyResponseUI() {
    }

    public CurrencyResponseUI(Currency currency) {
        this.id=currency.getId();
        this.code=currency.getCode();
        this.name=currency.getName();
        this.desc=currency.getDescryption();
        this.isOperation=currency.isOperation();
        this.status=currency.getStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
}
