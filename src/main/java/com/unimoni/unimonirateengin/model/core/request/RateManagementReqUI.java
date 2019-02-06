package com.unimoni.unimonirateengin.model.core.request;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Component
public class RateManagementReqUI {

    private String fromCurrency;
    private String ToCurrrency;
    private String ricId;
    //private Timestamp frequency;
    private BigDecimal bigValue;
    private BigDecimal askValue;
    private boolean isActive;
    private boolean isManual;

    private long serviceProviderID;
    private long productID;
    private long rateProviderID;

    public RateManagementReqUI() {
    }

    public String getFromCurrency() {
        return fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToCurrrency() {
        return ToCurrrency;
    }

    public void setToCurrrency(String toCurrrency) {
        ToCurrrency = toCurrrency;
    }

    public String getRicId() {
        return ricId;
    }

    public void setRicId(String ricId) {
        this.ricId = ricId;
    }

    public BigDecimal getBigValue() {
        return bigValue;
    }

    public void setBigValue(BigDecimal bigValue) {
        this.bigValue = bigValue;
    }

    public BigDecimal getAskValue() {
        return askValue;
    }

    public void setAskValue(BigDecimal askValue) {
        this.askValue = askValue;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public long getServiceProviderID() {
        return serviceProviderID;
    }

    public void setServiceProviderID(long serviceProviderID) {
        this.serviceProviderID = serviceProviderID;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public long getRateProviderID() {
        return rateProviderID;
    }

    public void setRateProviderID(long rateProviderID) {
        this.rateProviderID = rateProviderID;
    }
}
