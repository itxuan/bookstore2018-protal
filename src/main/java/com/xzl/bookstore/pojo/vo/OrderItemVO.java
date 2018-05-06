package com.xzl.bookstore.pojo.vo;

import com.xzl.bookstore.pojo.po.Order;
import com.xzl.bookstore.pojo.po.OrderItem;

import java.util.List;

public class OrderItemVO extends Order{

    private String endTimeVO;
    private String createTimeVO;
    private List<OrderItem> list;

    public List<OrderItem> getList() {
        return list;
    }

    public void setList(List<OrderItem> list) {
        this.list = list;
    }

    public String getEndTimeVO() {
        return endTimeVO;
    }

    public void setEndTimeVO(String endTimeVO) {
        this.endTimeVO = endTimeVO;
    }

    public String getCreateTimeVO() {
        return createTimeVO;
    }

    public void setCreateTimeVO(String createTimeVO) {
        this.createTimeVO = createTimeVO;
    }

}
