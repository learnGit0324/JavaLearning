package com.adam.BaseClass;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SeedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random(50);
		System.out.println("��һ������Ϊ50��Random����");
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextGaussian());
		Random r2 = new Random(50);
		System.out.println("�ڶ�������Ϊ50��Random����");
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextGaussian());
		Random r3 = new Random(100);
		System.out.println("�ڶ�������Ϊ50��Random����");
		System.out.println(r3.nextBoolean());
		System.out.println(r3.nextInt());
		System.out.println(r3.nextDouble());
		System.out.println(r3.nextGaussian());
		//���Ƿ���ǰ�����������ȫһ�£���˵��random���������ֲ�������ȫ����ģ�����һ��α�����
		//ʹ�õ�ǰʱ����Ϊ���ӣ�����Random������ȫһ�µ������
		Random r4 = new Random(System.currentTimeMillis());
		//������ǵ��̰߳�ȫ����ʹ��ThreadLocalRandom
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		int val1 = rand.nextInt(4,20);
		System.out.println(val1);
		
	}

}
