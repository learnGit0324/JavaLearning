package com.adam.BaseClass;

public class IdentifyHashCodeTest {
	public static void main(String[] args) {
		//下面程序中的s1 s2是两个不同的对象
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		//String重写了hashCode()方法 -- 改为根据字符串计算hashCode值
		//因为s1 s2的字符序列相同，所以他们的hashCode()方法返回值相同
		System.out.println(s1.hashCode() +"----"+s2.hashCode());
		//s1 s2是不同的字符串对象，所以他们的identifyHashCode值不同
		System.out.println(System.identityHashCode(s1)+"----"+System.identityHashCode(s2));
		//常量池
		String s3 ="Java";
		String s4 ="Java";
		System.out.println(System.identityHashCode(s3)+"----"+System.identityHashCode(s4));
	}
}
