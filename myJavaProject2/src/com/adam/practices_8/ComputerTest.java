package com.adam.practices_8;
/**
 * ����һ���ӿڲ�ʹ�������ڲ���ķ�ʽ�����ӿڵ�ʵ��
 * @author zhaoj
 * @version 1.0
 */
public class ComputerTest {
	public void test(Computer c) {
		System.out.println(c.getNmae()+"��ֵ��"+c.getPrice());
	}
	public static void main(String[] args) {
		ComputerTest ct = new ComputerTest();
		ct.test(new Computer() {
			
			@Override
			public double getPrice() {
				// TODO Auto-generated method stub
				return 3700.0;
			}
			
			@Override
			public String getNmae() {
				// TODO Auto-generated method stub
				return "ThinkPad New S2";
			}
		});
	}
}
