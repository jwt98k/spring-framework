package com.lab.source;

import com.lab.source.po.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhaocc
 * @version 1.0
 * @date 2025-07-02 23:51
 */
public class XmlMainTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Person person =applicationContext.getBean(Person.class);
		System.out.println(person);
	}
}
