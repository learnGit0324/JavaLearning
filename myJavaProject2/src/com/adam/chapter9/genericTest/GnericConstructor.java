package com.adam.chapter9.genericTest;

public class GnericConstructor {
	public static void main(String[] args) {
		//泛型构造器中的T类型为String
		new Foo("疯狂Java");
		//泛型构造器中的T类型为Integer
		new Foo(200);
		//显式指定泛型构造器中T类型为String
		//传给Foo构造器的实参也为String类型
		new <String> Foo("疯狂Java");
		//显式指定泛型构造器中T类型为String
		//传给Foo构造器的实参却为Double类型
		// The parameterized constructor <String>Foo(String) of type Foo is not applicable for the arguments (Double)
//		new <String> Foo(12.3);
	}
}

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}