package com.adam.chapter9.genericTest;

public class GenericDiamondTest {
	public static void main(String[] args) {
		//MyClass类生命中的E形参是String类型
		//泛型构造器中声明的T形参是Integer类型
		MyClass<String> mc1 = new MyClass<>(5);
		//显式指定泛型构造器中声明的T形参是Integer类型
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		//Explicit type arguments cannot be used with '<>' in an allocation expression
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}

class MyClass<E>{
	public <T> MyClass(T t){
		System.out.println("t参数的值为："+t);
	}
}