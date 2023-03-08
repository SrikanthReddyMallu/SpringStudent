package com.stu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain
{
public static void main(String[] args)
{
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("confi.xml");
	Student student = (Student) applicationContext.getBean("myemp");
	
	System.out.print(student);
}
}
