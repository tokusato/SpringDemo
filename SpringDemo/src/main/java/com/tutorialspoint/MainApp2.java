package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();

      ApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld hw = (HelloWorld) context2.getBean("helloWorld");
      System.out.println("I went world " + hw.getTimes() + "times");




   }
}