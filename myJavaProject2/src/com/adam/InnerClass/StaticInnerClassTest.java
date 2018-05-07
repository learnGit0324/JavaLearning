package com.adam.InnerClass;

public class StaticInnerClassTest {
	private int prop1 = 5;
	private static int prop2 = 9;
	static class StaticInnerClass{
		private String name = "Adam";
		//��̬�ڲ�����԰�����̬��Ա
		private static int age = 3;
		public void accessOuterProp() {
			//������󣬾�̬�ڲ����޷��ⲿ���ʵ������
//			System.out.println(prop1);
			//��������
			System.out.println(prop2);
		}
	}
	public static void main(String[] args) {
		System.out.println(StaticInnerClass.age);
		System.out.println(new StaticInnerClass().name);
		new StaticInnerClass().accessOuterProp();
	}
}
