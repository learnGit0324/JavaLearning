package com.adam.InnerClass;

public class SubClass extends Out.In{

	public SubClass(Out out) {
		//ͨ�������Out������ʾ����In�Ĺ�����
		out.super("hello");
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		//����Out���ڲ���In
		new Out().new In("Hello");
		//��������SubClass�Ĺ�����
		Out.In in = new SubClass(new Out());
	}
	
}
