package com.adam.BaseClass;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��Ĭ�ϵ�calendar����
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
		 * add �����޸ĵ��ֶγ���������ķ�Χʱ�ᷢ����Ϊ
		 * roll ���ᷢ����λ
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
		//���������˴���ֵΪfalse�������·�����Ϊ13ʱ����������ķ�Χ
//		System.out.println(cal.getTime());
	}

}
