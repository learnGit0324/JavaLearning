package com.adam.BaseClass;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		//×·¼Ó×Ö·û´®
		sb.append("Hello");
		//²åÈë×Ö·û´®
		sb.insert(5, ", World");
		//Ìæ»»×Ö·û´®
		sb.replace(6, 12, "Java");
		//É¾³ý×Ö·û´®
		sb.delete(5, 6);
		//·´×ª×Ö·û´®£¬°´Ë³Ðò·´×ª
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		StringBuilder sb2 = new StringBuilder("01234567890987654321");
		System.out.println(sb2.capacity());
	}

}
