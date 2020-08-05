package com.animals;

import org.springframework.stereotype.Service;

@Service
public class Tiger {
	
	/*
	<bean id="tiger" class="com.animals.Tiger">
    <property name="name" value="tMaxxi"/>
    <property name="color" value="tOrange"/>
    <property name="behaviour" value="attack"/>
    <property name="height" value="100"/>
    <property name="weight" value="170"/>
    <property name="does" value="kill"/>
    </bean>*/
	
	
	private String name="tMaxxi";
	private String color="tOrange";
	private String behaviour="attack";
	private int height=100;
	private int weight=170;
	private String does="kill";
	
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
	public String getDoes() {
		return does;
	}
	public void setDoes(String does) {
		this.does = does;
	}
	
	@Override
	public String toString() {
		return "Tiger [name=" + name + ", color=" + color + ", behaviour=" + behaviour + ", height=" + height
				+ ", weight=" + weight + ", does=" + does + "]";
	}
	
	

}
