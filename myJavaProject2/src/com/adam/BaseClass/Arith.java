package com.adam.BaseClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arith {
	//默认除法精度
	private static final int DEF_DIV_SCALE = 10;
	//构造器私有化，不能让这个类实例化
	private Arith() {}
	//提供精确地加法运算
	public static double add(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	//提供精确地减法运算
	public static double sub(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	//提供精确地乘法运算
	public static double mul(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	//提供（相对）精确地出发运算，当发生除不尽的情况时，
	//精确到小数点后第10位的数字四舍五入
	public static double div(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
	     //* @param  divisor value by which this {@code BigDecimal} is to be divided.
	     //* @param  scale scale of the {@code BigDecimal} quotient to be returned.
	     //* @param  roundingMode rounding mode to apply.
		return b1.divide(b2, DEF_DIV_SCALE, RoundingMode.HALF_UP).doubleValue();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double r1 = Arith.add(2.3, 2.4);
		System.out.println(r1);
		Double r2 =Arith.sub(2.3, 2.2);
		System.out.println(r2);
		//if two double variables do subtraction 
		double d1 = 2.3, d2 =2.2;
		System.out.println(d1 - d2);
		Double r3 = Arith.mul(2.3, 2.2);
		System.out.println(r3);
		Double r4 = Arith.div(2.3, 2.2);
		System.out.println(r4);
		//try to call this class in BigDecimalTest class		
	}

}
