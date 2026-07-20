package icu.zhaocc;

import icu.zhaocc.config.MyConfig;
import icu.zhaocc.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-20
 */
public class AnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService =(UserService) applicationContext.getBean("userService");
		String user = userService.getUser();
		System.out.println(user);
	}
}
