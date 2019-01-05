package com.adam;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import org.apache.log4j.Logger;
import org.junit.Test;


public class MethodHandleTest {
	Logger log = Logger.getLogger(MethodHandleTest.class);
	String PROPERTIES = "src/log4j-contrl.propertes";
	
	//定义一个private的类方法
	private static void hello() {
		System.out.println("hello world!");
	}
	//顶一个private的实例方法
	private String hello(String name) {
		System.out.println("执行带参数的hello： "+name);
		return name + ", 你好";
	} 
	
	@Test
	public void methodHandleTest1() throws Throwable {
		//定义一个返回值是void 不带参数的方法类型
		MethodType type = MethodType.methodType(void.class);
		//使用MethodHandles.Lookup的findStatic获取类方法
		MethodHandle mtd = MethodHandles.lookup()
				.findStatic(MethodHandleTest.class, "hello", type);
		//通过MethodHandle执行方法
		mtd.invoke();
		//使用MethodHandles.Lookup的findVirtual获取实例方法
		MethodHandle mtd2 = MethodHandles.lookup()
				.findVirtual(MethodHandleTest.class, "hello", 
						//制定获取返回值为String、形参为String的方法类型
						MethodType.methodType(String.class, String.class));
		//通过MethodHandle执行方法， 传入主调对象和参数
		System.out.println(mtd2.invoke(new MethodHandleTest(), "孙悟空"));
	}
}
