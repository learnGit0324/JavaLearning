package com.adam.GCTest;

import java.lang.ref.WeakReference;

public class ReferenceTest {
	public static void main(String[] args) {
		//创建一个字符串对象
		String str = new String("疯狂Java讲义");
		//创建一个弱引用，这个弱引用引用到"疯狂Java讲义"字符串
		WeakReference wr = new WeakReference(str);
		//切断str引用个"疯狂Java讲义"字符串之间的引用
		str = null;
		//取出弱引用引用的对象 返回值是：疯狂Java讲义
		System.out.println(wr.get());
		//调用垃圾回收机制的finalize方法
		System.gc();
		System.runFinalization();
		//再次取出弱引用所引用的对象，返回值是：null
		System.out.println(wr.get());
	}
}
