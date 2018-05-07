package com.adam.practices_8;

public abstract class Car {
	private String color;
	private double speed;
	public abstract void run(double speed);
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
}
