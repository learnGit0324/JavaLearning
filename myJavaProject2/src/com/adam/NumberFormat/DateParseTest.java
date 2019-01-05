package com.adam.NumberFormat;

import java.text.DateFormat;
import java.text.ParseException;

public class DateParseTest {
	public static void main(String[] args) throws ParseException {
		String str1 = "2019/01/01";
		String str2 = "2019Äê01ÔÂ01ÈÕ";
		String str3 = "2019/1/1";
		System.out.println(DateFormat.getDateInstance().parse(str2));
		System.out.println(DateFormat.getDateInstance(DateFormat.SHORT).parse(str1));
		System.out.println(DateFormat.getDateInstance().parse(str3));
		
	}
}
