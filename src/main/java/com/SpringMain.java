package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.p1.Customer;

public class SpringMain {
	
	public static void main(String[] args) {
		                              //Hey I am creating spring container
		 ApplicationContext springContainer = new ClassPathXmlApplicationContext("customer.xml");
		 //object manage by spring container is called bean  
		 Customer customer=(Customer)springContainer.getBean("pcustomer");
		 System.out.println(customer);
		 customer =null;
		 customer=(Customer)springContainer.getBean("pcustomer");
		 System.out.println(customer);
	}

}
