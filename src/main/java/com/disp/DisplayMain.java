package com.disp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DisplayMain {

	public static void main(String[] args) {
		//create spring container with xml file in it
		//new ClassPathXmlApplicationContext("display.xml"); is the instance 
		ApplicationContext context = new ClassPathXmlApplicationContext("display.xml");
		
		//<bean id="idisplay" class="DisplayMe">
		DisplayMe displayMe=(DisplayMe)context.getBean("idisplay");
		
		//call the method
		displayMe.show();
		
		displayMe=null;//spring reference cannot be null 
		
		

	}

}
