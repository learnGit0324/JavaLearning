package com.adam.enumTest;

public enum SeasonEnum {
	//在第一行列出四个枚举实例
	SPRING,SUMMER,FALL,WINTER;
	public static void main(String[] args) {
		// compareTo(E e) 该方法用于与指定的枚举类对象比较顺序
		//同一个枚举类实例只能与相同类型的枚举类实例进行比较
		//如果该枚举类对象位于指定枚举类对象之后，则返回正数
		//如果该枚举类对象位于指定枚举类对象之前，这返回负数
		//否则返回0
		int a = SPRING.compareTo(SUMMER);
		System.out.println(a); // -1
		//ordinal用于返回枚举类实例在枚举类的索引值
		int b = SPRING.ordinal();
		System.out.println(b);
		
	}
}
