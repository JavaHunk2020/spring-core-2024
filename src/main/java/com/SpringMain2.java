package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.p1.Company;

public class SpringMain2 {
	
	public static void main(String[] args) {
		                              //Hey I am creating spring container
		 ApplicationContext springContainer = new AnnotationConfigApplicationContext(JavaConfig.class);
		 //object manage by spring container is called bean  
		 Company company=(Company)springContainer.getBean(Company.class);
		 System.out.println(company);
		 company.printCustomer();
		 company.printDog();
	}

}
