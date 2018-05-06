package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.BookParam;
import com.xzl.bookstore.pojo.po.BookParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookParamMapper {
    int countByExample(BookParamExample example);

    int deleteByExample(BookParamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookParam record);

    int insertSelective(BookParam record);

    List<BookParam> selectByExample(BookParamExample example);

    BookParam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookParam record, @Param("example") BookParamExample example);

    int updateByExample(@Param("record") BookParam record, @Param("example") BookParamExample example);

    int updateByPrimaryKeySelective(BookParam record);

    int updateByPrimaryKey(BookParam record);
}