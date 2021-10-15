package com.my.test;

import com.my.test.circularReferences.AAA;
import com.my.test.service.GoodsService;
import com.my.test.service.UserService;
import com.my.test.validate.AAService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
public class ContextTest {
	public static void main(String[] args) throws Exception{
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*final UserService bean = context.getBean(UserService.class);
		bean.speak(232L);
		final GoodsService goodsService = context.getBean(GoodsService.class);
		goodsService.list();
		goodsService.saveGood();
*/
		/*AAA bean = context.getBean(AAA.class);
		bean.print();*/

		AAService bean = context.getBean(AAService.class);
		bean.printAA("sss");
		System.in.read();
	}
}
