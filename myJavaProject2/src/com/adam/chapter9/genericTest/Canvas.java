package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	//同时在画布上画多个形状
	//? extends Shape 表示泛型形参必须是Shape子类的List
	public void drawAll(List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Circle> circleList = new ArrayList<>();
		Canvas c = new Canvas();
		// The method drawAll(List<Shape>) in the type Canvas is not applicable for the arguments (ArrayList<Circle>)
		// 不能把List<Circle>当做List<Shape>使用，所以下面的代码编译错误
		c.drawAll(circleList);
	}
}
