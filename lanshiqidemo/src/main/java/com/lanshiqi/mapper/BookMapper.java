package com.lanshiqi.mapper;

import com.lanshiqi.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-26-16:31
 */

@Mapper
@Repository
public interface BookMapper {

    public List<Book> getBooks();

    public List<Book> getBooksByPage();


}
