package com.adam.GCTest;

public class FinalizeTest {
	public static FinalizeTest ft = null;
	public void info() {
		System.out.println("测试资源清理的finalize方法");
	}
	public static void main(String[] args) {
		//创建FinalizeTest对象立即进入可恢复状态 此时该对象还未被任何引用变量引用
		new FinalizeTest();
		//进行垃圾回收
		System.gc(); // 1 如果注释此处的代码,则垃圾回收机制不回去调用finalize方法，ft的引用依旧会是null
		//强制垃圾回收机制调用可恢复对象的finalize方法
//		Runtime.getRuntime().runFinalization();
		System.runFinalization();
		ft.info();
	}
	public void finalize() {
		//让ft引用到试图回收的可恢复对象，即可使可恢复对象变成可达状态
		ft = this;
	}
}
