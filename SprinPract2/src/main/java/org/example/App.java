package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AbstractApplicationContext cont = new ClassPathXmlApplicationContext("Spring.xml");
        Student stu = (Student) cont.getBean("student");
        System.out.println(stu.toString());
    }
}
