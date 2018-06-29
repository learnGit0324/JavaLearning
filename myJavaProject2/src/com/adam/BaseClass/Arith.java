package com.adam.BaseClass;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arith {
	//Ĭ�ϳ�������
	private static final int DEF_DIV_SCALE = 10;
	//������˽�л��������������ʵ����
	private Arith() {}
	//�ṩ��ȷ�ؼӷ�����
	public static double add(double v1, double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.add(b2).doubleValue();
	}
	//�ṩ��ȷ�ؼ�������
	public static double sub(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.subtract(b2).doubleValue();
	}
	//�ṩ��ȷ�س˷�����
	public static double mul(double v1,double v2) {
		BigDecimal b1 = BigDecimal.valueOf(v1);
		BigDecimal b2 = BigDecimal.valueOf(v2);
		return b1.multiply(b2).doubleValue();
	}
	//�ṩ����ԣ���ȷ�س������㣬�����������������ʱ��
	//��ȷ��С������10λ��������������
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
