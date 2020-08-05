package com.disp;

public class DisplayMe {

	private String name;
	private int age;
	private String color;
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public void setColor(String color) {
		this.color = color;
	}




	public void show() {
		System.out.println("Name-->"+name);
		System.out.println("Age-->"+age);
		System.out.println("Color-->"+color);
	}
}
