package com.adam.chapter9;

import java.util.Set;

public interface Map<K, V> {
	//在该接口里K， V完全可以作为类型使用
	Set<K> keySet();
	V put(K key, V value);
}
