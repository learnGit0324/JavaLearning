package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
	//ͬʱ�ڻ����ϻ������״
	//? extends Shape ��ʾ�����βα�����Shape�����List
	public void drawAll(List<? extends Shape> shapes) {
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Circle> circleList = new ArrayList<>();
		Canvas c = new Canvas();
		// The method drawAll(List<Shape>) in the type Canvas is not applicable for the arguments (ArrayList<Circle>)
		// ���ܰ�List<Circle>����List<Shape>ʹ�ã���������Ĵ���������
		c.drawAll(circleList);
	}
}
