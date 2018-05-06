package com.xzl.bookstore.pojo.po;

import java.util.Date;

public class Refund {
    private Integer id;

    private Integer orderId;

    private String reason;

    private Date appliationTime;

    private String isAdopt;

    private Long refundMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getAppliationTime() {
        return appliationTime;
    }

    public void setAppliationTime(Date appliationTime) {
        this.appliationTime = appliationTime;
    }

    public String getIsAdopt() {
        return isAdopt;
    }

    public void setIsAdopt(String isAdopt) {
        this.isAdopt = isAdopt == null ? null : isAdopt.trim();
    }

    public Long getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Long refundMoney) {
        this.refundMoney = refundMoney;
    }
}