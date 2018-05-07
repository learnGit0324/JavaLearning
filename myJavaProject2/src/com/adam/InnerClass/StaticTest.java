package com.adam.InnerClass;

public class StaticTest {
	//定义一个非静态内部类，是一个空类
	private class In{}
	//外部类静态方法
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//编译错误，静态成员（main方法）无法访问非静态成员（In类）
		//如果是静态内部类 则可以正常的访问
//		new In();
	}

}
