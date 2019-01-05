package com.adam;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// 返回Java支持的全部国家和语言的数组
		Locale[] localeList = Locale.getAvailableLocales();
		// 遍历 获取所支持的国家和语言
		for (int i = 0; i < localeList.length; i++) {
			System.out.println(localeList[i].getDisplayCountry() 
					+ "=" + localeList[i].getCountry() + " "
					+ localeList[i].getDisplayLanguage() 
					+ "=" + localeList[i].getLanguage());
		}
	}

}
