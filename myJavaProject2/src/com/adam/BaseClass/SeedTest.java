package com.adam.BaseClass;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SeedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r1 = new Random(50);
		System.out.println("第一个种子为50的Random对象");
		System.out.println(r1.nextBoolean());
		System.out.println(r1.nextInt());
		System.out.println(r1.nextDouble());
		System.out.println(r1.nextGaussian());
		Random r2 = new Random(50);
		System.out.println("第二个种子为50的Random对象");
		System.out.println(r2.nextBoolean());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextDouble());
		System.out.println(r2.nextGaussian());
		Random r3 = new Random(100);
		System.out.println("第二个种子为50的Random对象");
		System.out.println(r3.nextBoolean());
		System.out.println(r3.nextInt());
		System.out.println(r3.nextDouble());
		System.out.println(r3.nextGaussian());
		//我们发现前两组随机数完全一致，这说明random产生的数字并不是完全随机的，而是一组伪随机。
		//使用当前时间作为种子，避免Random产生完全一致的随机数
		Random r4 = new Random(System.currentTimeMillis());
		//如果考虑到线程安全可以使用ThreadLocalRandom
		ThreadLocalRandom rand = ThreadLocalRandom.current();
		int val1 = rand.nextInt(4,20);
		System.out.println(val1);
		
	}

}
