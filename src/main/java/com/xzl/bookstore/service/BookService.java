package com.xzl.bookstore.service;

import com.xzl.bookstore.pojo.po.Book;
import com.xzl.bookstore.pojo.po.BookCategory;
import com.xzl.bookstore.pojo.po.BookParam;
import com.xzl.bookstore.pojo.po.EBook;

import java.util.List;

public interface BookService {
    Book findById(Integer id);
    BookParam findBookParamByBookId(Integer bookId);
    BookCategory findBookCategoryByBookId(Integer id);
    EBook findEBookByBookId(Integer bookId);
    List<Book> selectBookByCategory(List<Integer> categoryList);
}
