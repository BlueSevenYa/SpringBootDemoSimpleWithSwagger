package com.lanshiqi.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-05-26-15:37
 */
@Component
@ConfigurationProperties(prefix = "book")
@PropertySource("classpath:book.properties")
public class BookBean {

    private String name;

    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
