package com.adam.chapter10;

import java.util.Date;

public class NullTest {
	/**
	 * b捕获异常时，一定记住先捕获小异常，再捕获大异常
	 * @param args
	 */
	public static void main(String[] args) {
		Date d = null;
		try {
			System.out.println(d.after(new Date()));
		} catch (NullPointerException ne) {
			System.out.println("空指针异常： " + ne);
		} catch (Exception e) {
			System.out.println("未知异常： " + e);
		}
	}
}
