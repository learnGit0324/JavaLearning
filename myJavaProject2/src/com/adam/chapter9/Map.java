package com.adam.chapter9;

import java.util.Set;

public interface Map<K, V> {
	//�ڸýӿ���K�� V��ȫ������Ϊ����ʹ��
	Set<K> keySet();
	V put(K key, V value);
}
