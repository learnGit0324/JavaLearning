package com.adam.InnerClass;

public class SubClass extends Out.In{

	public SubClass(Out out) {
		//通过传入的Out对象显示调用In的构造器
		out.super("hello");
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		//调用Out的内部类In
		new Out().new In("Hello");
		//调用子类SubClass的构造器
		Out.In in = new SubClass(new Out());
	}
	
}
