package com.studentapp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.studentapp.beans.Student;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/studentapp/resources/applicationContext.xml");
		Student student1 = (Student) context.getBean("student1");
		student1.getStudentDetials();
	}

}
