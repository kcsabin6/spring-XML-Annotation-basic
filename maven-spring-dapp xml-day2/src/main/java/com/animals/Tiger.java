package com.animals;

public class Tiger {
	
	private String name;
	private String color;
	private String behaviour;
	private int height;
	private int weight;
	private String does;
	
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
