package com.adam.BaseClass;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println("rand.nextBoolean:"+rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		//����0.0-1.0֮��α���double��
		System.out.println("rand.nextDouble"+rand.nextDouble());
		//����ƽ��ֵ��0.0����׼����1.0��α��˹��
		System.out.println(rand.nextGaussian());
		//����0-26֮���α�����
		System.out.println(rand.nextInt(26));
	}
}
