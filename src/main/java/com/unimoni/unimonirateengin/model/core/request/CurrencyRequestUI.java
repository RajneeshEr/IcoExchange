package com.unimoni.unimonirateengin.model.core.request;

import org.springframework.stereotype.Component;

@Component
public class CurrencyRequestUI {

    private String code;
    private String name;
    private String desc;
    private boolean isOperation;
    private String status;

    public CurrencyRequestUI() {
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
