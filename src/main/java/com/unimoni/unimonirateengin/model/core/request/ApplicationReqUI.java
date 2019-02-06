package com.unimoni.unimonirateengin.model.core.request;

import org.springframework.stereotype.Component;

@Component
public class ApplicationReqUI {

    private String code;
    private String name;
    private String desc;

    public ApplicationReqUI() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
