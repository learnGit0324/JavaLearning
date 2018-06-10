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
		//生成0.0-1.0之的伪随机double数
		System.out.println("rand.nextDouble"+rand.nextDouble());
		//生成平均值是0.0，标准差是1.0的伪高斯数
		System.out.println(rand.nextGaussian());
		//生成0-26之间的伪随机数
		System.out.println(rand.nextInt(26));
	}
}
