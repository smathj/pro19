package com.spring.ex01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest {

	public static void main(String[] args) {
		
		// person.xml Bean생성 ( main 메서드에서는 )
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		// person.xml에 있는 personService Bean 가져오기
		PersonService person = (PersonService) factory.getBean("personService");
		
		// PersonService person = new PersonServiceImpl();
		
		// sayHello 메서드 실행
		person.sayHello();
	}

}
