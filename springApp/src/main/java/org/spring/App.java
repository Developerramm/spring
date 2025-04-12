package org.spring;

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
        Shyam sm = ap.getBean("shyam",Shyam.class);
        sm.eat();
        sm.sleep();

        Ram rm = ap.getBean("ram", Ram.class);
        rm.eat();
        rm.sleep();

    }
}
