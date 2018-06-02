package com.lanshiqi.controller;

import com.lanshiqi.domain.TestUser;
import com.lanshiqi.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-06-02-12:09
 */

@RestController
public class TestUserController {


    @Autowired
    private TestUserService testUserService;


    @GetMapping(value = "/getAll")
    public List<TestUser> getAll(){
        return testUserService.getTestUsers();
    }

}
