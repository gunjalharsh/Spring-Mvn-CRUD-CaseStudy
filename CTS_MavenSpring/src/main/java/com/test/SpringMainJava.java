package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringMainJava {

	public static void main(String[] args) {
		
ApplicationContext ac=new ClassPathXmlApplicationContext("SpringConfig.xml");// loading the definitions from the given XML file and automatically refreshing the context.
		
		FirstBean myBean=(FirstBean) ac.getBean("Bean1");
		myBean.display();
		

	}

}
