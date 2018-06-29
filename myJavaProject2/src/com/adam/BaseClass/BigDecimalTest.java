package com.adam.BaseClass;

import java.math.BigDecimal;

public class BigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("使用String作为BigDecimal构造器参数");
		System.out.println("0.05 + 0.01 =" + f1.add(f2));
		System.out.println("0.05 - 0.01 =" + f1.subtract(f2));
		System.out.println("0.05 * 0.01 =" + f1.multiply(f2));
		System.out.println("0.05 / 0.01 =" + f1.divide(f2));
		System.out.println("使用double作为BigDecimal构造器参数");
		System.out.println("0.05 + 0.01 =" + f3.add(f2));
		System.out.println("0.05 - 0.01 =" + f3.subtract(f2));
		System.out.println("0.05 * 0.01 =" + f3.multiply(f2));
		System.out.println("0.05 / 0.01 =" + f3.divide(f2));
		// 从结果来看，创建BigDecimal对象时，一定要使用String对象作为构造器的参数，而不是直接使用double数字
		double r1 = Arith.add(0.05, 0.01);	
		System.out.println(r1);
	}

}
