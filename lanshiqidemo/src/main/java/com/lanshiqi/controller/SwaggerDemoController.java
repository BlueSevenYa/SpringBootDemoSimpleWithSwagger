package com.lanshiqi.controller;

import com.lanshiqi.domain.Book;
import com.lanshiqi.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-27-11:41
 */

@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
    @Autowired
    private BookService bookService;

    private static final Logger logger= LoggerFactory.getLogger(SwaggerDemoController.class);


    @ApiOperation(value = "分页查询所有Book", notes = "分页查询所有Book")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页数", paramType = "query", required = true, dataType = "int"),
            @ApiImplicitParam(name = "pageSize", value = "页大小", paramType = "query", required = true, dataType = "int")
    })
    @RequestMapping(value = "/getBooksByPage" ,method = RequestMethod.GET)
    public List<Book> getBooksByPage( @RequestParam(value = "pageNum") Integer pageNum,
                                     @RequestParam(value = "pageSize") Integer pageSize){
        List<Book> books=bookService.getBooksByPage(pageNum,pageSize);
        for(Book book:books){
            System.out.println(book);
        }
        return books;
    }


}
