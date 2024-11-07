package com.pratik.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.pratik.demo")
public class AppConfig {
////	Change bean name or assign multiple names (deault is method name)
////	@Bean(name="com2")
////	@Bean(name={"com2","desktop1","beast"})
//	@Bean
//	@Scope("prototype")
//	public Desktop desktop() {
//		return new Desktop();
//	}
//	
//	@Bean
////	@Primary we can use this instead of qualifier
//	//if both are ther qualifier will take priority
//	@Scope("prototype")
//	public Laptop laptop() {
//		return new Laptop();
//	}
//	
//	//to select a bean when multiple of same type exist,
//	//use Qualifier (also Autowired annotation is optinal in newer versions
//	@Bean
//	public Alien alien(@Qualifier("desktop") Computer com) {
////	public Alien alien(@Autowired @Qualifier("desktop") Computer com) {
//		Alien obj=new Alien();
//		obj.setAge(25);
//		obj.setCom(com);
//		return obj;
//	}
}
