package com.adam.BaseClass;

import java.util.Calendar;

public class LazyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal =Calendar.getInstance();
		cal.set(2003, 7, 31);
		//���·�����Ϊ9������9��31�Ų�����
		//��������޸ģ�ϵͳ���cal�Զ�������10��1��
		cal.set(Calendar.MONTH, 8);
		System.out.println(cal.getTime()); //���10��1��
		cal.set(Calendar.DATE, 5);
		System.out.println(cal.getTime());
	}

}
