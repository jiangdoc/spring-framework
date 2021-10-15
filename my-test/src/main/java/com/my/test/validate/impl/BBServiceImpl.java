package com.my.test.validate.impl;

import com.my.test.validate.AAService;
import com.my.test.validate.BBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangwenjie
 * @date 2021/8/19
 */
@Service
public class BBServiceImpl implements BBService {

    @Autowired
    private AAService aaService;
    @Override
    public void printBB(String value) {
        System.out.println("BB print value: " + value);
    }
}
