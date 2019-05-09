package com.adam.chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {
	/**
	 * getMessage() 返回该异常的详细描述字符串
	 * printStackTrace() 将该异常的跟踪栈信息输出到标准错误输出
	 * printStackTrace(PrintStream s) 将该异常的跟踪栈信息输出到标准错误输出
	 * getStackTrace() 返回该异常的跟踪栈信息
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
	}
}
