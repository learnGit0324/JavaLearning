package com.adam.chapter9.genericTest;

public class GnericConstructor {
	public static void main(String[] args) {
		//���͹������е�T����ΪString
		new Foo("���Java");
		//���͹������е�T����ΪInteger
		new Foo(200);
		//��ʽָ�����͹�������T����ΪString
		//����Foo��������ʵ��ҲΪString����
		new <String> Foo("���Java");
		//��ʽָ�����͹�������T����ΪString
		//����Foo��������ʵ��ȴΪDouble����
		// The parameterized constructor <String>Foo(String) of type Foo is not applicable for the arguments (Double)
//		new <String> Foo(12.3);
	}
}

class Foo{
	public <T> Foo(T t){
		System.out.println(t);
	}
}