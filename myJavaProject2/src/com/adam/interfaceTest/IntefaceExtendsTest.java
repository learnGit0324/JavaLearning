package com.adam.interfaceTest;

public class IntefaceExtendsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ӿ�InterfaceC�̳��� A B �ĳ���
		System.out.println(InterfaceC.PROD_A);
		System.out.println(InterfaceC.PROD_B);
		System.out.println(InterfaceC.PROD_C);
	}

}
interface InterfaceA{
	static final int PROD_A = 5;
	public abstract void testA();
}
interface InterfaceB{
	static final int PROD_B = 6;
	public abstract void testB();
}
interface InterfaceC extends InterfaceA,InterfaceB{
	static final int PROD_C =7;
	public abstract void testC();
}