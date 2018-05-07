package com.adam.LambdaTest;

public class LambdaAndInner {
	private int age = 12;
	private static String  name = "��������������";
	public void test() {
		String book = "���Java����";
		Displayable dis = () -> {
			//���� "effectively final"�ľֲ�����
			System.out.println(book);
			//�����ⲿ���ʵ�������������
			System.out.println(age);
			System.out.println(name);
		};
		dis.display();
		//����dis��������ӽӿ��н�ϲ��ܵ�add()����
		System.out.println(dis.add(3, 5));
		//���Ե��ýӿ��е�Ĭ�Ϸ���,����������
//		System.out.println(add(3,5));
	}
	public void test2(Displayable displayable) {
		displayable.display();
	}
	public static void main(String[] args) {
		LambdaAndInner lambda = new LambdaAndInner();
				lambda.test();
				lambda.test2(new Displayable() {
					
					@Override
					public void display() {
						// TODO Auto-generated method stub
						System.out.println("Adam");
					}
				});
	}
}
@FunctionalInterface
interface Displayable{
	//����һ�����󷽷���Ĭ�Ϸ���
	void display();
	default int add(int a, int b) {
		return a+b;
	}
}