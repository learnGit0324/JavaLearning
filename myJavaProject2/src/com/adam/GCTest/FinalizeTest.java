package com.adam.GCTest;

public class FinalizeTest {
	public static FinalizeTest ft = null;
	public void info() {
		System.out.println("������Դ�����finalize����");
	}
	public static void main(String[] args) {
		//����FinalizeTest������������ɻָ�״̬ ��ʱ�ö���δ���κ����ñ�������
		new FinalizeTest();
		//������������
		System.gc(); // 1 ���ע�ʹ˴��Ĵ���,���������ջ��Ʋ���ȥ����finalize������ft���������ɻ���null
		//ǿ���������ջ��Ƶ��ÿɻָ������finalize����
//		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		ft.info();
	}
	public void finalize() {
		//��ft���õ���ͼ���յĿɻָ����󣬼���ʹ�ɻָ������ɿɴ�״̬
		ft = this;
	}
}
