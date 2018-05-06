package com.xzl.bookstore.pojo.po;

import java.util.Date;

public class Order {

    private Integer id;

    private Integer userId;

    private String orderItemIds;

    private Byte status;

    private String receiveName;

    private String receiveTelephone;

    private Date createTime;

    private Date endTime;

    private String isDelete;

    private Long sum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderItemIds() {
        return orderItemIds;
    }

    public void setOrderItemIds(String orderItemIds) {
        this.orderItemIds = orderItemIds == null ? null : orderItemIds.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceiveTelephone() {
        return receiveTelephone;
    }

    public void setReceiveTelephone(String receiveTelephone) {
        this.receiveTelephone = receiveTelephone == null ? null : receiveTelephone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Long getSum() {
        return sum;
    }

    public void setSum(Long sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderItemIds='" + orderItemIds + '\'' +
                ", status=" + status +
                ", receiveName='" + receiveName + '\'' +
                ", receiveTelephone='" + receiveTelephone + '\'' +
                ", createTime=" + createTime +
                ", endTime=" + endTime +
                ", isDelete='" + isDelete + '\'' +
                ", sum=" + sum +
                '}';
    }
}