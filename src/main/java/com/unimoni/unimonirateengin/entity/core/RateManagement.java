package com.unimoni.unimonirateengin.entity.core;

import com.unimoni.unimonirateengin.model.core.request.RateManagementReqUI;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@Entity
public class RateManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "uiid")
    long id;

    private String fromCurrency;
    private String ToCurrrency;
    private String ricId;
    //private Timestamp frequency;  // TODO  setter/getter database part
    private BigDecimal bigValue;
    private BigDecimal askValue;
    private boolean isActive;

    //@Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdatedTime;
    //@Temporal(TemporalType.TIMESTAMP)
    private Date createdOnTime;

    private boolean isManual;

    @OneToOne
    private ServiceProvider serviceProvider;
    @OneToOne
    private Product product;
    @OneToOne
    private RateProvider rateProvider;

    public RateManagement() {
    }


    public RateManagement(RateManagementReqUI rateManagementReqUI) {

        this.fromCurrency=rateManagementReqUI.getFromCurrency();
        this.ToCurrrency=rateManagementReqUI.getToCurrrency();
        this.ricId=rateManagementReqUI.getRicId();
        //this.frequency=rateManagementReqUI.getFrequency();
        this.bigValue=rateManagementReqUI.getBigValue();
        this.askValue=rateManagementReqUI.getAskValue();
        this.isActive=true;
        //this.isManual=false;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Date getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public Date getCreatedOnTime() {
        return createdOnTime;
    }

    public void setCreatedOnTime(Date createdOnTime) {
        this.createdOnTime = createdOnTime;
    }

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public RateProvider getRateProvider() {
        return rateProvider;
    }

    public void setRateProvider(RateProvider rateProvider) {
        this.rateProvider = rateProvider;
    }
}
