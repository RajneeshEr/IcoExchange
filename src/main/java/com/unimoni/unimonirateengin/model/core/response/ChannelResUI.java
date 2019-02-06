package com.unimoni.unimonirateengin.model.core.response;

import org.springframework.stereotype.Component;

@Component
public class ChannelResUI {
    long id;
    private String code;
    private String name;
    private String desc;

    public ChannelResUI() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
