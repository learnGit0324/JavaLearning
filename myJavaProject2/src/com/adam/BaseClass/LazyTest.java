package com.adam.BaseClass;

import java.util.Calendar;

public class LazyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();
		cal.set(2003, 7, 31);
		//将月份设置为9，但是9月31号不存在
		//如果立即修改，系统会把cal自动调整到10月1日
		cal.set(Calendar.MONTH, 8);
		System.out.println(cal.getTime()); //输出10月1日
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}

}
