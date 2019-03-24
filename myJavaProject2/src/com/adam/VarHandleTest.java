package com.adam;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.Arrays;

public class VarHandleTest {
	public static void main(String[] args) throws Throwable {
		String[] as = new String[]{"Java","Kotlin","Go"};
		//��ȡһ��String[]�����VarHandle����
		VarHandle avh = MethodHandles.arrayElementVarHandle(String[].class);
		//�Ƚϲ����ã����������Ԫ����Go�����Ԫ�ر���ΪLua
		boolean r = avh.compareAndSet(as,2,"Go","Lua");
		System.out.println(r);
		System.out.println(Arrays.toString(as));
		//��ȡas�ĵڶ���Ԫ��
		System.out.println(avh.get(as,1));
		//��ȡ�����ã����ص�����Ԫ�أ�����������Ԫ����ΪSwift
		System.out.println(avh.getAndSet(as,2,"Swift"));
		System.out.println(Arrays.toString(as));
		//��findVarHandle������ȡUser������Ϊname
		VarHandle vh1 = MethodHandles.lookup().findVarHandle(User.class, "name", String.class);
		User user = new User();
		System.out.println(vh1.get(user));
		vh1.set(user,"�����");
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