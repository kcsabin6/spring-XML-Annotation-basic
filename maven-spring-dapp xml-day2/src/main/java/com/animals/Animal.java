package com.animals;

public class Animal {
	
	private String candoes;
	private Cat cat;
	private Dog dog;
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
