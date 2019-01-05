package com.adam;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

import org.apache.log4j.Logger;
import org.junit.Test;


public class MethodHandleTest {
	Logger log = Logger.getLogger(MethodHandleTest.class);
	String PROPERTIES = "src/log4j-contrl.propertes";
	
	//����һ��private���෽��
	private static void hello() {
		System.out.println("hello world!");
	}
	//��һ��private��ʵ������
	private String hello(String name) {
		System.out.println("ִ�д�������hello�� "+name);
		return name + ", ���";
	} 
	
	@Test
	public void methodHandleTest1() throws Throwable {
		//����һ������ֵ��void ���������ķ�������
		MethodType type = MethodType.methodType(void.class);
		//ʹ��MethodHandles.Lookup��findStatic��ȡ�෽��
		MethodHandle mtd = MethodHandles.lookup()
				.findStatic(MethodHandleTest.class, "hello", type);
		//ͨ��MethodHandleִ�з���
		mtd.invoke();
		//ʹ��MethodHandles.Lookup��findVirtual��ȡʵ������
		MethodHandle mtd2 = MethodHandles.lookup()
				.findVirtual(MethodHandleTest.class, "hello", 
						//�ƶ���ȡ����ֵΪString���β�ΪString�ķ�������
						MethodType.methodType(String.class, String.class));
		//ͨ��MethodHandleִ�з����� ������������Ͳ���
		System.out.println(mtd2.invoke(new MethodHandleTest(), "�����"));
	}
}
