package iuc.zhaocc;

import iuc.zhaocc.po.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.ManagementFactory;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2026-07-15
 */
public class XmlSourceApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean2.xml");
		// Person person = (Person) applicationContext.getBean("person");
		// System.out.println(person);

	}
}