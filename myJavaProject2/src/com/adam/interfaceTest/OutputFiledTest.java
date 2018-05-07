package com.adam.interfaceTest;

public class OutputFiledTest{
	public static void main(String[] args) {
		//访问同一个包中的Output接口中得MAX_CACHE_SIZE常量
		System.out.println(Output.MAX_CACHE_SIZE);
		//编译错误，提示接口中得常量不能被赋值 因为其被final修饰
//		Output.MAX_CACHE_SIZE = 20;
		//使用借口来调用类方法
		System.out.println(Output.stringTest());
	}
}
