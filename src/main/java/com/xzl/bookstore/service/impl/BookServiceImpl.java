package com.xzl.bookstore.service.impl;

import com.xzl.bookstore.dao.BookCategoryMapper;
import com.xzl.bookstore.dao.BookMapper;
import com.xzl.bookstore.dao.BookParamMapper;
import com.xzl.bookstore.dao.EBookMapper;
import com.xzl.bookstore.pojo.po.*;
import com.xzl.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {

    @Override
    public Book findById(Integer id) {

        return bookMapper.selectByPrimaryKey(id);
    }

    @Override
    public BookParam findBookParamByBookId(Integer bookId) {

        BookParamExample bookParamExample = new BookParamExample();
        BookParamExample.Criteria criteria = bookParamExample.createCriteria();
        criteria.andBookIdEqualTo(bookId);
        List<BookParam> bookParams = bookParamMapper.selectByExample(bookParamExample);
        if( bookParams!= null && bookParams.size() > 0){
            return bookParams.get(0);
        }
        return null;
    }

    @Override
    public BookCategory findBookCategoryByBookId(Integer id) {
        BookCategory category = bookCategoryMapper.selectByPrimaryKey(id);
        return category;
    }

    @Override
    public EBook findEBookByBookId(Integer bookId) {
        EBookExample eBookExample = new EBookExample();
        EBookExample.Criteria criteria = eBookExample.createCriteria();
        criteria.andBookIdEqualTo(bookId);
        List<EBook> eBooks = eBookMapper.selectByExample(eBookExample);
        if(eBooks != null && eBooks.size()>0){
            return eBooks.get(0);
        }
        return null;
    }

    @Override
    public List<Book> selectBookByCategory(List<Integer> categoryList) {
        BookExample bookExample = new BookExample();
        BookExample.Criteria criteria = bookExample.createCriteria();
        criteria.andStateEqualTo(1).andCategoryIdIn(categoryList);
        bookExample.setOrderByClause("created DESC");
        return bookMapper.selectByExample(bookExample);
    }

    @Autowired
    BookMapper bookMapper;
    @Autowired
    BookCategoryMapper bookCategoryMapper;
    @Autowired
    BookParamMapper bookParamMapper;
    @Autowired
    EBookMapper eBookMapper;
}
