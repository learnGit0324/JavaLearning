package com.adam.BaseClass;

public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		User u1 = new User(29);
		User u2 = u1.clone();
		//�ж�u1��u2�Ƿ����,�����false
		System.out.println(u1==u2);
		//�ж�u1��u2�ĵ�ַaddress�Ƿ����,�����true
		System.out.println(u1.adress == u2.adress);
		//u1��u2����ȣ�˵������������ȫ��ͬ�����ö��󣬵�ַ��ͬ˵������ĳ�Ա����ֵ��ͬ
	}
}
class Adress{
	String detail;
	public Adress(String detail) {
		this.detail = detail;
	}
}
//ʵ��Cloneable�ӿ�
class User implements Cloneable{
	int age;
	Adress adress;
	public User(int age) {
		this.age = age;
		adress = new Adress("�������");
	}
	//����super.clone������ʵ��clone()����
	public User clone() throws CloneNotSupportedException {
		return (User) super.clone();
		
	}
}