package com.animals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnimal {

	public static void main(String[] args) {
		
		//create container with xml
		ApplicationContext context = new ClassPathXmlApplicationContext("com.animal.xml");
		
		//create beans with id
		Animal aAnimal=(Animal)context.getBean("animal");
		System.out.println(aAnimal);
		System.out.println(aAnimal.getCat());
		System.out.println(aAnimal);
		System.out.println(aAnimal.getDog());
		System.out.println(aAnimal);
		System.out.println(aAnimal.getTiger());
		System.out.println(aAnimal);
		
		
		
		
		
	/*	Cat cCat=(Cat)context.getBean("cat");
		System.out.println(cCat);
		
		Dog dDog=(Dog)context.getBean("dog");
		System.out.println(dDog);
		
		Tiger tTiger=(Tiger)context.getBean("tiger");
		System.out.println(tTiger);*/
		
		
		

	}

}
