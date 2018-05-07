package com.adam.InnerClass;

public class Outer {
	private int outProp = 9;
	class Inner{
		private int inProp = 5;
		public void accessOuterProp() {
			//非静态内部类可以直接访问外部类的private成员变量
			System.out.println("外部类的outProp值："+outProp);
		}
	}
	public void accessInnerProp() {
		//编译错误 外部类不能直接访问非静态内部类的实例变量
//		System.out.println("内部类的inProp值是："+inProp);
		System.out.println("内部类的inProp值是："+new Inner().inProp);
	}
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.accessInnerProp();
	}
}
