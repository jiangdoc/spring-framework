package test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author jiangwenjie
 * @date 2021/4/24
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan({"test"})
public class AppConfig {
}
