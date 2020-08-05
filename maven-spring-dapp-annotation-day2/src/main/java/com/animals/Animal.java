package com.animals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Animal {
	
	/* <bean id="animal" class="com.animals.Animal">
     <property name="candoes" value="walkorrun"/>
     <property name="Cat" ref="cat"/>
     <property name="Dog" ref="dog"/>
     <property name="Tiger" ref="tiger"/>
     </bean>*/
	
	
	private String candoes="walkorrun";
	
	@Autowired
	@Qualifier("cat")
	private Cat cat;
	
	@Autowired
	@Qualifier("dog")
	private Dog dog;
	
	@Autowired
	@Qualifier("tiger")
	private Tiger tiger;
	
	public String getCandoes() {
		return candoes;
	}
	public void setCandoes(String candoes) {
		this.candoes = candoes;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	public Tiger getTiger() {
		return tiger;
	}
	public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	}
	
	@Override
	public String toString() {
		return "Animal [candoes=" + candoes + ", cat=" + cat + ", dog=" + dog + ", tiger=" + tiger + "]";
	}
	
	
	
	
	

}
