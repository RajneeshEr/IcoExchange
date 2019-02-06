package com.unimoni.unimonirateengin.model.core.response;

import com.unimoni.unimonirateengin.entity.core.RateManagement;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;

@Component
public class RateManagementResUI {

    private String fromCurrency;
    private String ToCurrrency;
    private String rateProviderName;
    private String ric;
    //private Timestamp frequency;  //TODO setter/getter
    private String productName;
    private BigDecimal bigValue;
    private BigDecimal askValue;
    private Time lastUpdatedTime;
    private boolean status;  // isActive is real column

    public RateManagementResUI() {
    }

    public RateManagementResUI(RateManagement rateManagement) {
        this.fromCurrency=rateManagement.getFromCurrency();
        this.ToCurrrency=rateManagement.getToCurrrency();
        //this.rateProviderName=rateManagement.get;
        this.ric=rateManagement.getRicId();
        //this.frequency=rateManagement.getFrequency();
        //this.productName=rateManagement.get;
        this.bigValue=rateManagement.getBigValue();
        this.askValue=rateManagement.getAskValue();
        this.status=rateManagement.isActive();
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

    public String getRateProviderName() {
        return rateProviderName;
    }

    public void setRateProviderName(String rateProviderName) {
        this.rateProviderName = rateProviderName;
    }

    public String getRic() {
        return ric;
    }

    public void setRic(String ric) {
        this.ric = ric;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public Time getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Time lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
