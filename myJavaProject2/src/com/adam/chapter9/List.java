package com.adam.chapter9;

import java.util.Iterator;

public interface List<E> {
	//�ڸýӿ��E����Ϊ����ʹ��
	//����ķ����E����Ϊ��������
	void add(E e);
	Iterator<E> iterator();
}
