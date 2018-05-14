package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.BookCategory;
import com.xzl.bookstore.pojo.po.BookCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookCategoryMapper {
    int countByExample(BookCategoryExample example);

    int deleteByExample(BookCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookCategory record);

    int insertSelective(BookCategory record);

    List<BookCategory> selectByExample(BookCategoryExample example);

    BookCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByExample(@Param("record") BookCategory record, @Param("example") BookCategoryExample example);

    int updateByPrimaryKeySelective(BookCategory record);

    int updateByPrimaryKey(BookCategory record);
}