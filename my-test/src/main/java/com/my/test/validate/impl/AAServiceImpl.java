package com.my.test.validate.impl;

import com.my.test.validate.AAService;
import com.my.test.validate.BBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author jiangwenjie
 * @date 2021/8/19
 */
@Validated
@Service
public class AAServiceImpl implements AAService {

    @Autowired
    private BBService bbService;

    @Override
    public void printAA(String value) {
        System.out.println("AA print value: "+ value);
    }
}
