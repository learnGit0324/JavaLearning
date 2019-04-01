package com.adam.chapter9.genericTest;

import java.util.ArrayList;
import java.util.Collection;

public class MyUtils {
	
	public static void main(String[] args) {
		ArrayList<Number> ln = new ArrayList<>();
		ArrayList<Integer> li = new ArrayList<>();
		li.add(5);
		//此处准确知道最后一个被复制的元素是Integer类型， 与src集合元素类型相同
		Integer last = copy(ln, li);
		System.out.println(last);
	}
	
	//下面的dest集合元素的类型必须是与src集合元素的类型相同，或者是其父类
	public static <T> T copy(Collection<? super T> dest, Collection<T> src) {
		T last = null;
		for (T t : src) {
			last = t;
			dest.add(last);
		}
		return last;
	}
}
