package com.adam.enumTest;

public enum Gender3 implements GenderDesc{
	MALE("男"){
		public void test() {
			System.out.println("这个枚举值代表男性");
		}
	},
	FEMALE("女"){
		public void test() {
			System.out.println("这个枚举值代表女性");
		}
	};
	private final String name;
	private Gender3(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("这是一个用于返回性别的枚举类");
	}

}
