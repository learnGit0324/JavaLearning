package com.adam.chapter9;

import java.util.Iterator;

public interface List<E> {
	//在该接口里，E可作为类型使用
	//下面的方法里，E可作为参数类型
	void add(E e);
	Iterator<E> iterator();
}
