package com.adam.InnerClass;

public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass{
		private String name = "Adam";
		//静态内部类可以包含静态成员
		private static int age = 3;
		public void accessOuterProp() {
			//编译错误，静态内部类无法外部类的实例变量
//			System.out.println(prop1);
			//编译正常
			System.out.println(prop2);
		}
	}
	public static void main(String[] args) {
		System.out.println(StaticInnerClass.age);
		System.out.println(new StaticInnerClass().name);
		new StaticInnerClass().accessOuterProp();
	}
}
