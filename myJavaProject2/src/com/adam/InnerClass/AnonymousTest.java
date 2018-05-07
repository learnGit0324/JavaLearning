package com.adam.InnerClass;

public class AnonymousTest {
	public void test(Product p) {
		System.out.println("������һ��"+p.getName()+",������"+p.getPrice());
	}
	public static void main(String[] args) {
		AnonymousTest p = new AnonymousTest();
		p.test(new Product() {

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
			
		});
	}
}
interface Product{
	public double getPrice();
	public String getName();
}