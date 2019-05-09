package com.adam.chapter9.genericTest;

import org.junit.Assert;

public class GenericDiamondTest {
	public static void main(String[] args) {
		//MyClass�������е�E�β���String����
		//���͹�������������T�β���Integer����
		MyClass<String> mc1 = new MyClass<>(5);
		Assert.assertNotNull(mc1);
		//��ʽָ�����͹�������������T�β���Integer����
		MyClass<String> mc2 = new <Integer> MyClass<String>(5);
		Assert.assertNotNull(mc2);
		//Explicit type arguments cannot be used with '<>' in an allocation expression
//		MyClass<String> mc3 = new <Integer> MyClass<>(5);
	}
}

class MyClass<E>{
	public <T> MyClass(T t){
		System.out.println("t������ֵΪ��"+t);
	}
}