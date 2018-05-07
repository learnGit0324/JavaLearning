package com.adam.GCTest;

import java.lang.ref.WeakReference;

public class ReferenceTest {
	public static void main(String[] args) {
		//����һ���ַ�������
		String str = new String("���Java����");
		//����һ�������ã�������������õ�"���Java����"�ַ���
		WeakReference wr = new WeakReference(str);
		//�ж�str���ø�"���Java����"�ַ���֮�������
		str = null;
		//ȡ�����������õĶ��� ����ֵ�ǣ����Java����
		System.out.println(wr.get());
		//�����������ջ��Ƶ�finalize����
		System.gc();
		System.runFinalization();
		//�ٴ�ȡ�������������õĶ��󣬷���ֵ�ǣ�null
		System.out.println(wr.get());
	}
}
