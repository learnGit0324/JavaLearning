package com.adam.BaseClass;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User(29);
		User u2 = u1.clone();
		//判断u1和u2是否相等,结果是false
		System.out.println(u1==u2);
		//判断u1和u2的地址address是否相等,结果是true
		System.out.println(u1.adress == u2.adress);
		//u1和u2不相等，说明这是两个完全不同的饮用对象，地址相同说明对象的成员变量值相同
	}
}
class Adress{
	String detail;
	public Adress(String detail) {
		this.detail = detail;
	}
}
//实现Cloneable接口
class User implements Cloneable{
	int age;
	Adress adress;
	public User(int age) {
		this.age = age;
		adress = new Adress("广州天河");
	}
	//调用super.clone方法来实现clone()方法
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
		
	}
}