package com.adam.Abstract;

public abstract class Shape {
	private String color;
	{
		System.out.println("ִ��Shape�ĳ�ʼ���顣����");
	}
	//����һ�������ܳ��ĳ��󷽷�
	public abstract double calPerimeter();
	//����һ��������״�ĳ��󷽷�
	public  abstract String getType();
	//����Shape�Ĺ��������ù��������������ڴ������󣬶��Ǳ��������
	public Shape(){
		System.out.println("ִ��Shape���޲ι�����");
	}
	public Shape(String color){
		System.out.println("ִ��Shape�Ĺ�����");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
