package com.adam.InnerClass;

public class AnonymousTest2 implements Product{

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 567.8;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "AGP�Կ�";
	}
	
	public void test(Product p) {
		System.out.println("������һ��"+p.getName()+",������"+p.getPrice());
	}
	public static void main(String[] args) {
		AnonymousTest2 p = new AnonymousTest2();
		p.test(new AnonymousTest2());
	}
}
