package com.my.test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"com.my.test.service"})
public class AppConfig {
}
