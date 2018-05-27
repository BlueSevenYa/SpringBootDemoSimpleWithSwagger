package com.lanshiqi.service;

import com.lanshiqi.domain.Book;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-26-16:32
 */
public interface BookService {

    public List<Book> getBooks();

    public List<Book> getBooksByPage(Integer pageNum,Integer pageSize);

}
