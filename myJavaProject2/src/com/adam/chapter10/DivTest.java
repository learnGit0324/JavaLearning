package com.adam.chapter10;

public class DivTest {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("the result of dividing two numbers is: "+c);
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("数组越界： 运行程序时输入的参数个数不够"+ie);
		} catch (NumberFormatException ne) {
			System.out.println("数字格式异常： 程序只能接收整数参数。"+ne);
		} catch (ArithmeticException ae) {
			System.out.println("算数异常"+ae);
		} catch (Exception e) {
			System.out.println("未知异常"+e);
		}
	}
}
