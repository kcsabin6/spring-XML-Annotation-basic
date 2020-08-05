package com.animals;

import org.springframework.stereotype.Service;

@Service
public class Cat {
	
	/*<bean id="cat" class="com.animals.Cat">
    <property name="name" value="cNihaow"/>
    <property name="color" value="cWhiteee"/>
    <property name="behaviour" value="cScratch"/>
    <property name="height" value="20"/>
    </bean>*/
    
    
	private String name="cNihaow";
	private String color="cWhiteee";
	private String behaviour="cScratch";
	private int height=20;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", behaviour=" + behaviour + ", height=" + height + "]";
	}
	
	

}
