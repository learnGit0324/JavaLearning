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
//				e.printStackTrace();  //用于打印异常的跟踪栈信息
				return;
			} finally {
				if (fis != null) {
					try {
						fis.close();
					} catch (IOException ioe) {
						ioe.printStackTrace();
					}
				}
				System.out.println("执行finally块里的资源回收！");
		}
	}
}
