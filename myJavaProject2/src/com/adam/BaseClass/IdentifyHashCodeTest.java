package com.adam.BaseClass;

public class IdentifyHashCodeTest {
	public static void main(String[] args) {
		//��������е�s1 s2��������ͬ�Ķ���
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String��д��hashCode()���� -- ��Ϊ�����ַ�������hashCodeֵ
		//��Ϊs1 s2���ַ�������ͬ���������ǵ�hashCode()��������ֵ��ͬ
		System.out.println(s1.hashCode() +"----"+s2.hashCode());
		//s1 s2�ǲ�ͬ���ַ��������������ǵ�identifyHashCodeֵ��ͬ
		System.out.println(System.identityHashCode(s1)+"----"+System.identityHashCode(s2));
		//������
		String s3 ="Java";
		String s4 ="Java";
		System.out.println(System.identityHashCode(s3)+"----"+System.identityHashCode(s4));
	}
}
