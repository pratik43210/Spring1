package com.pratik.demo;

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
//    	create a container for IoC
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//       return type for getBean is Object so we have to cast it
//    	as object type Alien
    	Alien obj=(Alien) context.getBean("alien");
        obj.code();
//        obj.setAge(25);
        System.out.println(obj.getAge());
        
//        Alien obj2=(Alien) context.getBean("alien");
//        obj2.code();
//        System.out.println(obj2.age);
    }
}
