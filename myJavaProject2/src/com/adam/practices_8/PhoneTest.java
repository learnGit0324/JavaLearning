package com.adam.practices_8;

public class PhoneTest {
	public void call(Phone p) {
		System.out.println(p);
		p.callPhone();
	}
	public static void main(String[] args) {
		PhoneTest pt = new PhoneTest();
		pt.call(()->System.out.println("call somoebody's phone number"));
	}
}	
