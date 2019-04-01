package com.adam.chapter9;

public interface Iterator<E> {
	//在该接口里E完全可以作为类型使用
	E next();
	boolean hasNext();
}
