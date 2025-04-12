package org.spring;

import org.spring.ci.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println(ap);

        Student student = ap.getBean("student",Student.class);
        System.out.println(student.toString());

//        Student student = ap.getBean("student", Student.class);
//        System.out.println(student.toString());

//        Student st1 = ap.getBean("student", Student.class);
//        System.out.println(st1.toString());

//        Student st1 = ap.getBean("st1", Student.class);
//        Student st2 = ap.getBean("st2", Student.class);
//
//        System.out.println(st1.toString());
//        System.out.println(st2.toString());

    }
}
