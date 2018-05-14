package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.EBook;
import com.xzl.bookstore.pojo.po.EBookExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EBookMapper {
    int countByExample(EBookExample example);

    int deleteByExample(EBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EBook record);

    int insertSelective(EBook record);

    List<EBook> selectByExample(EBookExample example);

    EBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EBook record, @Param("example") EBookExample example);

    int updateByExample(@Param("record") EBook record, @Param("example") EBookExample example);

    int updateByPrimaryKeySelective(EBook record);

    int updateByPrimaryKey(EBook record);
}