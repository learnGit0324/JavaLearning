package com.adam.chapter9.genericTest;

public class Circle extends Shape{

	@Override
	public void draw(Canvas c) {
		System.out.println("在画布"+c+"上画一个圆");
	}

}
