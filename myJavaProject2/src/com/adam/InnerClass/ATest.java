package com.adam.InnerClass;

public class ATest {
	public static void main(String[] args) {
		int age = 8; //����age���ھֲ�����
		A a = new A() {

			@Override
			public void test() {
				// TODO Auto-generated method stub
				//��Java 8֮ǰ������﷨����ʾ����age����ʹ��final����
				//��Java 8��ʼ�������ڲ��࣬�ֲ��ڲ���������ʷ�final�ľֲ�����
				System.out.println(age);
			}
			
		};
		a.test();
		//Local variable age defined in an enclosing scope must be final or effectively final
		//age��final���Σ��������±���ֵ
		//age = 10;
	}
}
interface A{
	//A�ӿ�ֻ�����˳��󷽷�
	void test();
}