package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class App
{
    public static void main ( String[] args )throws Exception
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("data-format.xml");
        SimpleDateFormat format=context.getBean("dateFormat", SimpleDateFormat.class);

        Date date= format.parse("31/08/2024");
        System.out.println(date);
    }
}
