package com.adam.chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinalTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
			try {
				fis = new FileInputStream("a.txt");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
//				e.printStackTrace();  //���ڴ�ӡ�쳣�ĸ���ջ��Ϣ
				return;
			} finally {
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
				System.out.println("ִ��finally�������Դ���գ�");
		}
	}
}
