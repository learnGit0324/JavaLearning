package com.adam.interfaceTest;

public interface Output {
	//定义接口里的成员变量只能是常量
	int MAX_CACHE_SIZE = 40;
	//定义接口里的方法只能是public的抽象方法
	public abstract void out();
	void getData(String msg);
	//接口里定义默认方法需要使用default修饰，而且要有方法体实现
	default void test(){
		System.out.println("默认的test()方法");
	}
	default void print(String... msgs) {
		for(String msg:msgs) {
			System.out.println(msg);
		}
	}
	//接口中定义类方法需要使用static修饰，而且类的方法要有方法体
	static String stringTest(){
		return "接口里的类方法";
	}
	//接口中定义私有方法, 接口的私有方法也要有方法体 仅支持JDK 9
	static void foo(){
		System.out.println("foo私有方法");
	}
	//定义私有静态方法
	static void bar(){
		System.out.println("私有静态方法");
	}
}	
