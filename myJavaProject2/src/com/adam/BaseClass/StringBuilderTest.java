package com.adam.BaseClass;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		//׷���ַ���
		sb.append("Hello");
		//�����ַ���
		sb.insert(5, ", World");
		//�滻�ַ���
		sb.replace(6, 12, "Java");
		//ɾ���ַ���
		sb.delete(5, 6);
		//��ת�ַ�������˳��ת
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuilder sb2 = new StringBuilder("01234567890987654321");
		System.out.println(sb2.capacity());
	}

}
