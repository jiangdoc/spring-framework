package com.my.test.circularReferences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author jiangwenjie
 * @date 2021/7/25
 */
@Component
public class AAA {
	@Autowired
	private BBB bbb;

	public AAA() {
		System.out.println("实例化AAA");
	}

	public void print(){
		bbb.print();
	}
}
