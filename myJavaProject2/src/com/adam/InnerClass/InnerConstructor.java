package com.adam.InnerClass;
/**
 * ���ⲿ������ĵط�������̬�ڲ����ʵ��
 * @author zhaoj
 *
 */
public class InnerConstructor {
	public static void main(String[] args) {
		//��̬�ڲ�����Ϊ�ⲿ���һ����Ա����ֱ��ʹ���ⲿ����.�ڲ��๹�������д���ʵ��
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		//ͨ��new�ؼ��ֵ����ڲ��๹����������̬�ڲ������
		new StaticOut.StaticIn();
	}
}
class StaticOut{
	//����һ����̬�ڲ��࣬�����÷��ʿ��Ʒ�
	//��ͬһ�����е���������Է����ظ��ڲ���
	static class StaticIn{
		public StaticIn() {
			System.out.println("��̬�ڲ���Ĺ�����");
		}
	}
}