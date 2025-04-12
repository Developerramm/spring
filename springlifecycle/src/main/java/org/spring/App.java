package org.spring;

import org.spring.xml.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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
        AbstractApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        System.out.println(ap);
        Student st = ap.getBean("st1", Student.class);
        System.out.println(st.toString());
        ap.registerShutdownHook();
    }
}
