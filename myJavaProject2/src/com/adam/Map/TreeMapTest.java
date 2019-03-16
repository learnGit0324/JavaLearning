package com.adam.Map;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put(new R(3), "Adam");
		tm.put(new R(-5), "FJ");
		tm.put(new R(9), "YY");
		//支持自然排序 和  定制排序
		System.out.println(tm);
		//返回TreeMap的第一个Entry对象
		System.out.println(tm.firstEntry());
		//区别于firstKey
		System.out.println(tm.firstKey());
		//返回该TreeMap的最后一个key
		System.out.println(tm.lastKey());
		//返回该TreeMap的比new R(2)大的最小key值
		System.out.println(tm.higherKey(new R(2)));
		//返回该TreeMap的比new R(2)小的最大key值
		System.out.println(tm.lowerEntry(new R(2)));
		//返回该TreeMap的子TreeMap
		System.out.println(tm.subMap(new R(-1), new R(4)));
		
		
		TreeMap tm2 = new TreeMap(compare());
		tm2.put(3, "C");
		tm2.put(4, "D");
		System.out.println(tm2);
	}

	private static Comparator compare() {
		return null;
	}
}

class R implements Comparable{
	int count;

	public R(int count) {
		this.count = count;
	}

	public String toString() {
		return "R[count: " + count + "]";
	}

	// 根据count来计算两个对象是否相等
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == R.class) {
			R r = (R) obj;
			return r.count == this.count;
		}
		return false;
	}

	// 根据count属性值来判断两个对象的大小
	public int compareTo(Object obj) {
		R r = (R) obj;
		return count > r.count ? 1 : count < r.count ? -1 : 0;

	}
}