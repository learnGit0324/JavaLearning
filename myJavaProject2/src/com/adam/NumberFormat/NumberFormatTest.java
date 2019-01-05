package com.adam.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	/**
	 * MessageForamt��������Format�����࣬Format�����໹���������࣬�ֱ���NumberFormat��DateFormat
	 * ���������ˣ�
	 * format() ���� ����ֵ�����ڸ�ʽ�����ַ���
	 * parse() ���� ���ַ�����������ֵ������
	 * @param args
	 */
	public static void main(String[] args) {
		double db = 1234000.567;
		//�����ĸ�Locale���ֱ������ �� �� ��
		Locale[] locales = new Locale[] {Locale.CHINA,Locale.JAPAN,Locale.GERMAN,Locale.US};
		NumberFormat[] nf = new NumberFormat[12];
		//Ϊ�����ĸ�Locale����12��NumberFormat����
		//ÿһ��Local�ֱ���ͨ����ֵ��ʽ�����ٷ�����ʽ�������Ҹ�ʽ��
		for (int i = 0; i < locales.length; i++) {
			nf[i*3] = NumberFormat.getNumberInstance(locales[i]);
			nf[i*3+1] = NumberFormat.getPercentInstance(locales[i]);
			nf[i*3+2] = NumberFormat.getCurrencyInstance(locales[i]);
		}
		for (int i = 0; i < locales.length; i++) {
			String tip = i == 0 ? "---�й��ĸ�ʽ---":i == 1 ? "---�ձ��ĸ�ʽ---" : i == 2 ? "---�¹��ĸ�ʽ---" : "---�����ĸ�ʽ---";
			System.out.println(tip);
			System.out.println("ͨ����ֵ��ʽ��"+nf[i*3].format(db));
			System.out.println("�ٷֱ���ֵ��ʽ��"+nf[i*3+1].format(db));
			System.out.println("������ֵ��ʽ��"+nf[i*3+2].format(db));
		}
	}
}
