package com.run;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
    public static void main( String[] args )
    {
		try{
            System.out.println( "dubbo provider start!" );
            ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");//("dubbo-provider.xml");
            context.start();
            System.in.read();
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
    }
}
