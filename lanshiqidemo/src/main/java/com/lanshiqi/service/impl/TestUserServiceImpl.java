package com.lanshiqi.service.impl;

import com.lanshiqi.domain.TestUser;
import com.lanshiqi.mapper.TestUserMapper;
import com.lanshiqi.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by
 *
 * @author=蓝十七
 * @on 2018-06-02-12:07
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;


    @Override
    public List<TestUser> getTestUsers() {
        return testUserMapper.getTestUsers();
    }
}
