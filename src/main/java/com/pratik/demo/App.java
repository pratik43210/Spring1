package com.pratik.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pratik.demo.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{  
    public static void main( String[] args )
    {
    	//using java based container
    	ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Alien obj=context.getBean(Alien.class);
	    System.out.println(obj.getAge());
	    obj.code();
    	 
//    	Desktop dt=context.getBean(Desktop.class);
//    	Desktop dt=context.getBean("com2",Desktop.class);
//    	dt.complie();
    	
    	//using xml based container
//    	create a container for IoC
//    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//       return type for getBean is Object so we have to cast it
//    	as object type Alien
//    	Alien obj=(Alien) context.getBean("alien");
//    	Alien obj=context.getBean("alien",Alien.class);
//        obj.code();
//        obj.setAge(25);
//        System.out.println(obj.getAge());
        
//        Alien obj2=(Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);
//        Desktop obj2=context.getBean("com1",Desktop.class);
//        Desktop obj2=context.getBean(Desktop.class);
//        Computer com=context.getBean(Desktop.class);
//        below code will only work when we specify a primary bean
//        Computer com=context.getBean(Computer.class);
    }
}
