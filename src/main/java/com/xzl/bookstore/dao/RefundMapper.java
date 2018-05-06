package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.Refund;
import com.xzl.bookstore.pojo.po.RefundExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RefundMapper {
    int countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKey(Refund record);
}