package com.adam.enumTest;

public enum Gender implements GenderDesc{
	MALE,FEMALE;
	//定义一个public修饰的实例变量
	public String name;
	//封装name属性 进制外部程序直接访问
	public void setName(String name) {
		switch(this) {
		case MALE:
			if (name.equals("男")) {
				this.name = name;
			}
			else {
				System.out.println("参数错误");
				return;
			}
			break;
		case FEMALE:
			if(name.equals("女")) {
				this.name = name;
			}
			else {
				System.out.println("参数错误");
				return;
			}
			break;
		}
	}
	public String getName(){
		return this.name;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("这是一个用于定于性别的枚举类");
	}
}
