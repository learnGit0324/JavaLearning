package com.adam.interfaceTest;

public interface Output {
	//����ӿ���ĳ�Ա����ֻ���ǳ���
	int MAX_SIZE = 40;
	//����ӿ���ķ���ֻ����public�ĳ��󷽷�
	public abstract void out();
	void getData(String msg);
	//�ӿ��ﶨ��Ĭ�Ϸ�����Ҫʹ��default���Σ�����Ҫ�з�����ʵ��
	default void test(){
		System.out.println("Ĭ�ϵ�test()����");
	}
	//�ӿ��ж����෽����Ҫʹ��static���Σ�������ķ���Ҫ�з�����
	static String stringTest(){
		return "�ӿ�����෽��";
	}
	//�ӿ��ж���˽�з���, �ӿڵ�˽�з���ҲҪ�з����� ��֧��JDK 9
	private void foo(){
		System.out.println("foo˽�з���");
	}
	//����˽�о�̬����
	private static void bar(){
		
	}
}	
