package com.my.test.circularReferences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jiangwenjie
 * @date 2021/7/25
 */
@Component
public class BBB {

	@Autowired
	private AAA aaa;

	public BBB() {
		System.out.println("实例化BBB");
	}

	public void print(){
		System.out.println("------BBB-----");
	}
}
