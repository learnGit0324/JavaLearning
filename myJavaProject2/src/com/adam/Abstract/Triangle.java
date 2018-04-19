package com.adam.Abstract;

public class Triangle extends Shape{
	private double a, b, c;
	public Triangle(String color, double a, double b, double c){
		super(color);
		this.setSides(a, b, c);
	}
	public void setSides(double a, double b, double c) {
		// TODO Auto-generated method stub
		if(a >= b+c || b >= a+c || c >= a+b){
			System.out.println("三角形两边之和必须大于第三边");
			return;
		}
		this.a = a;
		this.b = b;
		this.c = c;
	}
	//重写Shape类的计算周长的方法
	public double calPerimeter(){
		return a + b + c;
	}
	//重写Shape类的返回形状的抽象方法
	public String getType(){
		return "三角形";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
