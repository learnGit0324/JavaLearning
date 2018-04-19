package com.adam.Abstract;

public class Circle extends Shape{
	private double radius;
	public Circle(String color, double radius){
		super(color);
		this.radius = radius;
	}
	public void setRdaius(double radius){
		this.radius = radius;
	}
	//��дShape��ļ����ܳ��ĳ��󷽷�
	public double calPerimeter(){
		return radius * 2 * Math.PI;
	}
	//��дShape��ķ�����״�ĳ��󷽷�
	public String getType(){
		return getColor()+"Բ��";
	}
	public static void main(String[] args) {
		Shape s1 = new Triangle("��ɫ",3,4,5);
		Shape s2 = new Circle("��ɫ",3);
		System.out.println(s1.getType());
		System.out.println(s1.calPerimeter());
		System.out.println(s2.getColor());
		System.out.println(s2.calPerimeter());
	}
}
