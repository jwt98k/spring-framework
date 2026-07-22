package icu.zhaocc;

import icu.zhaocc.config.MyConfig;
import icu.zhaocc.po.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-22
 */
public class AnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		applicationContext.getBean(Person.class);

	}
}
