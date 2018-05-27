package com.lanshiqi.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lanshiqi.domain.Book;
import com.lanshiqi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-26-16:27
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/getBooks",method = RequestMethod.GET)
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(value = "/getBooksByPage" ,method = RequestMethod.GET)
    public List<Book> getBooksByPage(@RequestParam(value="pageNum") Integer pageNum,
                                     @RequestParam(value = "pageSize") Integer pageSize){
        List<Book> books=bookService.getBooksByPage(pageNum,pageSize);
        for(Book book:books){
            System.out.println(book);
        }
        return books;
    }

    @RequestMapping(value = "/getBooksByPageOfJSON" ,method = RequestMethod.GET)
    public JSONObject getBooksByPageOfJSON(@RequestParam(value="pageNum") Integer pageNum,
                                           @RequestParam(value = "pageSize") Integer pageSize){
        List<Book> books=bookService.getBooksByPage(pageNum,pageSize);
        JSONObject jsonObject=new JSONObject();
        JSONArray jsonArray=new JSONArray();
        for(Book book:books){
            System.out.println(book);
            JSONObject jsonObject1=new JSONObject();
            jsonObject1.put("username",book.getUsername());
            jsonObject1.put("password",book.getPassword());
            jsonArray.add(jsonObject1);
        }
        jsonObject.put("data",jsonArray);
        jsonObject.put("size",books.size());
        return jsonObject;
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String bookIndex(){
        return "index";
    }

}
