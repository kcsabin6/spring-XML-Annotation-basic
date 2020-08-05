package com.animals;

import org.springframework.stereotype.Service;

@Service
public class Dog {
	
	/*<bean id="dog" class="com.animals.Dog">
    <property name="name" value="dTommy"/>
    <property name="color" value="dBlack"/>
    <property name="behaviour" value="dplay"/>
    <property name="height" value="80"/>
    <property name="weight" value="70"/>
    </bean>*/
	
	
	private String name="dTommy";
	private String color="dBlack";
	private String behaviour="dplay";
	private int height=80;
	private int weight=70;
	
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", behaviour=" + behaviour + ", height=" + height
				+ ", weight=" + weight + "]";
	}
	
	

}
