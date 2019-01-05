package com.adam;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// ����Java֧�ֵ�ȫ�����Һ����Ե�����
		Locale[] localeList = Locale.getAvailableLocales();
		// ���� ��ȡ��֧�ֵĹ��Һ�����
		for (int i = 0; i < localeList.length; i++) {
			System.out.println(localeList[i].getDisplayCountry() 
					+ "=" + localeList[i].getCountry() + " "
					+ localeList[i].getDisplayLanguage() 
					+ "=" + localeList[i].getLanguage());
		}
	}

}
