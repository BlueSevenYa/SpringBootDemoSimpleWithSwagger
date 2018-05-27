package com.lanshiqi.service.impl;

import com.github.pagehelper.PageHelper;
import com.lanshiqi.domain.Book;
import com.lanshiqi.mapper.BookMapper;
import com.lanshiqi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-26-16:33
 */
@Service
public class BookServiceImpl implements BookService{


    @Autowired
    private BookMapper bookMapper;


    @Override
    public List<Book> getBooks() {
        return bookMapper.getBooks();
    }

    @Override
    public List<Book> getBooksByPage(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Book> books=bookMapper.getBooksByPage();
        return books;
    }
}
