package com.xzl.bookstore.dao;

import com.xzl.bookstore.pojo.po.CommentTag;
import com.xzl.bookstore.pojo.po.CommentTagExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentTagMapper {
    int countByExample(CommentTagExample example);

    int deleteByExample(CommentTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommentTag record);

    int insertSelective(CommentTag record);

    List<CommentTag> selectByExample(CommentTagExample example);

    CommentTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommentTag record, @Param("example") CommentTagExample example);

    int updateByExample(@Param("record") CommentTag record, @Param("example") CommentTagExample example);

    int updateByPrimaryKeySelective(CommentTag record);

    int updateByPrimaryKey(CommentTag record);
}