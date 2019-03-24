package com.adam;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

public class VarHandleTest {
	public static void main(String[] args) throws Throwable {
		String[] as = new String[]{"Java","Kotlin","Go"};
		//获取一个String[]数组的VarHandle对象
		VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
		//比较并设置：如果第三个元素是Go，则该元素被设为Lua
		boolean r = avh.compareAndSet(as,2,"Go","Lua");
		System.out.println(r);
		System.out.println(Arrays.toString(as));
		//获取as的第二个元素
		System.out.println(avh.get(as,1));
		//获取并设置：返回第三个元素，并将第三个元素设为Swift
		System.out.println(avh.getAndSet(as,2,"Swift"));
		System.out.println(Arrays.toString(as));
		//用findVarHandle方法获取User类中名为name
		VarHandle vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
		User user = new User();
		System.out.println(vh1.get(user));
		vh1.set(user,"孙悟空");
		System.out.println(user.name);
		VarHandle vh2 = MethodHandles.lookup().findStaticVarHandle(User.class, "MAX_AGE", int.class);
		System.out.println(vh2.get());
		vh2.set(100);
		System.out.println(vh2.get());
		System.out.println(User.MAX_AGE);
	}
}
class User{
	String name;
	static int MAX_AGE;
}