package com.adam.chapter10;

public class DivTest {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("the result of dividing two numbers is: "+c);
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("����Խ�磺 ���г���ʱ����Ĳ�����������"+ie);
		} catch (NumberFormatException ne) {
			System.out.println("���ָ�ʽ�쳣�� ����ֻ�ܽ�������������"+ne);
		} catch (ArithmeticException ae) {
			System.out.println("�����쳣"+ae);
		} catch (Exception e) {
			System.out.println("δ֪�쳣"+e);
		}
	}
}
