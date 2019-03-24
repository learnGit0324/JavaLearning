package com.adam.Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest {
	public static void main(String[] args) {
		//����һ���յ� ���ɱ��List����
		List<Object> unmodifiableList = Collections.emptyList();
		//����һ��ֻ��һ��Ԫ�� ���ɸı��Set����
		Set<String> unmodifiableSet = Collections.singleton("���Java����");
		//����һ����ͨ��Map����
		HashMap<Object, Object> map = new HashMap<>();
		map.put("����", 80);
		map.put("��ѧ", 82);
		//������ͨ��Map�����Ӧ�Ĳ��ɱ�汾
		Map<Object, Object> unmodifiableMap = Collections.unmodifiableMap(map);
		//������κ�һ�ж�������UnsupportedOperationException�쳣
		unmodifiableList.add("����Ԫ��");
		unmodifiableSet.add("����Ԫ��");
		unmodifiableMap.put("����", 90);
	}
}
