package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.List;

public class GenericAndArrayTest2 {
	public static void main(String[] args) {
		//java允许创建无上限的通配符泛型数组， 例如new ArrayList<?>[10] 使得程序不得不进行强制类型转换
		List<?>[] lsa = new ArrayList<?>[10];
		//将lsa向上转型为Object[]类型的变量
		Object[] oa = lsa;
		List<Integer> li = new ArrayList<>();
		li.add(3);
		oa[1] = li;
		Object target = lsa[1].get(0);
		
		if (target instanceof String) {
			//下面的代码安全
			String s = (String) target;
			System.out.println(s);
		}
	}
}
