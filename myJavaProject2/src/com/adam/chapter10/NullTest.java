package com.adam.chapter10;

import java.util.Date;

public class NullTest {
	/**
	 * b�����쳣ʱ��һ����ס�Ȳ���С�쳣���ٲ�����쳣
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		} catch (NullPointerException ne) {
			System.out.println("��ָ���쳣�� " + ne);
		} catch (Exception e) {
			System.out.println("δ֪�쳣�� " + e);
		}
	}
}
