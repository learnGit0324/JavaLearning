package com.adam.chapter9.genericTest;

public class InferenceTest {
	public static void main(String[] args) {
		//可以通过方法赋值的目标参数来推断泛型为String
		MyUtil<String> ls = MyUtil.nil();
		//无需使用下面的语句在调用nil()方法时指定泛型的类型
		MyUtil<String> mu = MyUtil.<String>nil();
		//可调用cons()方法所需要的参数类型来推断泛型为Integer
		MyUtil.cons(42, MyUtil.nil());
		//无需使用下面的语句在调用nil()方法时指定泛型的类型
		MyUtil.cons(42, MyUtil.<Integer>nil());
	}
}

class MyUtil<E>{
	public static <T> MyUtil<T> nil(){
		return null;
	}
	
	public static <T> MyUtil<T> cons(T head, MyUtil<T> tail){
		return null;
	}
}