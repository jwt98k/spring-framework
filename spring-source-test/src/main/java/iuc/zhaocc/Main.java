package iuc.zhaocc;

import iuc.zhaocc.po.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.ManagementFactory;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-15
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(
				ManagementFactory.getRuntimeMXBean().getInputArguments()
		);
		System.out.println(Main.class.getProtectionDomain()
				.getCodeSource()
				.getLocation());
		System.out.println("123");
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Person person = (Person) applicationContext.getBean("person");
		System.out.println(person);

	}
}