package com.adam.Abstract;

public abstract class Shape {
	private String color;
	{
		System.out.println("执行Shape的初始化块。。。");
	}
	//定义一个计算周长的抽象方法
	public abstract double calPerimeter();
	//定义一个返回形状的抽象方法
	public  abstract String getType();
	//定义Shape的构造器，该构造器并不适用于创建对象，而是被子类调用
	public Shape(){
		System.out.println("执行Shape的无参构造器");
	}
	public Shape(String color){
		System.out.println("执行Shape的构造器");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
