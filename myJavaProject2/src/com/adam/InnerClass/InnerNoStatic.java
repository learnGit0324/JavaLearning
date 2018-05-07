package com.adam.InnerClass;

public class InnerNoStatic {
	private class InnerClass{
		/**
		 * 非静态内部类不能有静态声明
		 */
		//非静态内部类里面不能定义静态代码块
//		static {
//			System.out.println("===============");
//		}
//		private static int inProp;
//		private static void test() {}
	}
}
