package com.adam.BaseClass;

import java.io.IOException;

public class RuntimeTest {
	public static void main(String[] args) throws IOException {
		//获取Runtime程序关联的运行时对象
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量:"+rt.availableProcessors());
		System.out.println("空闲内存数:"+rt.freeMemory());
		System.out.println("最大内存数:"+rt.maxMemory());
		rt.exec("notepad.exe");
	}
}
