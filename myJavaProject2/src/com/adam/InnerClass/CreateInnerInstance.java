package com.adam.InnerClass;

public class CreateInnerInstance {
	public static void main(String[] args) {
		Out.In in = new Out().new In("������Ϣ");
		/**
		 * ���������Ը�Ϊ�������д���
		 * ʹ��OuterClass.InnerClass����ʽ�����ڲ������
		 * Out.In in
		 * �����ⲿ��ʵ�����Ǿ�̬�ڲ���ʵ�����Ĵ��ڸ�ʵ����
		 * Out out = new Out();
		 * ͨ���ⲿ��ʵ����new�������ڲ��๹���������Ǿ�̬�ڲ���ʵ��
		 * out.new In("������Ϣ")
		 */
	}
}
class Out{
	//����һ���ڲ��಻���÷��ʿ��Ʒ�
	//��ֻ��ͬһ�����е���������Է��ʸ��ڲ���
	class In{
		public In(String msg) {
			System.out.println(msg);
		}
	}
}