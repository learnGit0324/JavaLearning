package com.adam.chapter10;

import java.io.FileInputStream;
import java.io.IOException;

public class AccessExceptionMsg {
	/**
	 * getMessage() ���ظ��쳣����ϸ�����ַ���
	 * printStackTrace() �����쳣�ĸ���ջ��Ϣ�������׼�������
	 * printStackTrace(PrintStream s) �����쳣�ĸ���ջ��Ϣ�������׼�������
	 * getStackTrace() ���ظ��쳣�ĸ���ջ��Ϣ
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
