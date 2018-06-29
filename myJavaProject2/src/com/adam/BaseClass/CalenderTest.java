package com.adam.BaseClass;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个默认的calendar对象
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC+8:00")); 
		Date d1= calendar.getTime();
		Date d2 = calendar2.getTime();
		System.out.println(d1);
		System.out.println(d2);
		calendar.add(Calendar.MONTH, 1);
		d1= calendar.getTime();
		System.out.println(d1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.YEAR));
		/*
		 * add 当被修改的字段超出它允许的范围时会发生仅为
		 * roll 不会发生进位
		 */
		calendar.add(Calendar.MONTH, -8);
		System.out.println(calendar.getTime());
		calendar2.roll(Calendar.MONTH, -8);
		System.out.println(calendar2.getTime());
		//setLenient
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 13);
		System.out.println(cal.getTime());
		cal.setLenient(false);
		cal.set(Calendar.MONTH, 13);
		//由于设置了错容值为false，当把月份设置为13时超出了允许的范围
//		System.out.println(cal.getTime());
	}

}
