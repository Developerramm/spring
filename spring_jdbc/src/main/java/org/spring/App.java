package org.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ap = new ClassPathXmlApplicationContext("Beans.xml");
        JdbcTemplate jd = ap.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jd);
    }
}
