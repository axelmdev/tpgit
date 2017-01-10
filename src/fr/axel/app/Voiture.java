package fr.axel.app;

public class Voiture {
	public int age;
	public String name;
	public String marque;
	public String color;
	
	public int getAge() {
            this.age = this.age + this.age;
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMarque() {
		return marque;
	}
	public void setCreator(String marque) {
		this.marque = marque;
	}
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
}