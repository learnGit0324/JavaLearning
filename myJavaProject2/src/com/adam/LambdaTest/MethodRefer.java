package com.adam.LambdaTest;

import javax.swing.JFrame;

public class MethodRefer {

	public static void main(String[] args) {
		//�������ʹ��Lambda���ʽ����Converter����
		Converter converter1 = from -> Integer.valueOf(from);
		Integer val = converter1.converter("99");
		System.out.println(val);
		//�������ô���Lambda���ʽ:�����෽��
		//����ʽ�ӿ��б�ʵ�ֵķ���ȫ���Ĳ����������෽����Ϊ����
		Converter converter2 = Integer::valueOf;
		Integer val2 = converter2.converter("99");
		System.out.println(val2);
		//����ı��ʽ��ʹ��Lambda���ʽ����Converter����
		//�����ض������ʵ������
		Converter converter3 = from -> "fkit.org".indexOf(from);
		Integer val3 = converter3.converter("it");
		System.out.println(val3);
		//�������ô���Lambda���ʽ�������ض������ʵ������
		//����ʽ�ӿ��б�ʵ�ֵķ�����ȫ�����������÷�����Ϊ����
		Converter converter4 = "fkit.org"::indexOf;
		Integer val4 = converter4.converter("it");
		System.out.println(val4);
		//����ĳ������ʵ������
		MyTest mt = (a,b,c) -> a.substring(b, c);
		String str = mt.test("Java I Love You", 2, 9);
		System.out.println(str);
		//�������ô���Lambda���ʽ������ĳ������ʵ������
		//����ʽ�ӿ��б�ʵ�ַ����ĵ�һ����������Ϊ������
		//����Ĳ���ȫ�����ݸ��÷�����Ϊ����
		MyTest mt2 = String::substring;
		String str2 = mt2.test("Java I Love You", 2, 9);
		System.out.println(str2);
		//����Ĵ���ʹ��Lambda���ʽ����YouTest����
		YouTest yt = (String a) -> new JFrame(a);
		JFrame jf= yt.win("�ҵĴ���");
		System.out.println(jf);
		//���������ô���Lambda���ʽ
		//����ʽ�ӿ��б�ʵ�ַ�����ȫ�����������ù�������Ϊ����
		YouTest yt2 = JFrame::new;
	}
}
@FunctionalInterface
interface Converter{
	Integer converter(String from);
}
@FunctionalInterface
interface MyTest{
	String test(String a, int b, int c);
}
@FunctionalInterface
interface YouTest{
	JFrame win(String title);
}