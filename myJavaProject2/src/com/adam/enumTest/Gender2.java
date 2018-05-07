package com.adam.enumTest;

public enum Gender2 implements GenderDesc{
	//此处的枚举类必须使用相应的构造器来创建
	MALE("女"),FEMALE("男");
	private final String name;
	//枚举类的构造器必须使用private修饰
	private Gender2(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	//实现接口的抽象方法
	@Override
	public void test(){
		System.out.println("这是一个用于定义性别的枚举类");
	}
}
