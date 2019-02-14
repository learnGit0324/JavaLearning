package com.adam.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//打印HashSet集合，集合元素没有重复
		System.out.println(hs);
		//取出第一个元素
		Iterator it = hs.iterator();
		R r = (R) it.next();
		//为第一个元素的count实例变量赋值  
		r.count = -3;
		//再次输出HashSet集合， 集合元素有重复元素
		System.out.println(hs);
		//删除count为-3的R对象
		hs.remove(new R(-3));
		//可以看到被删除了一个R元素
		System.out.println(hs);
		//满足eRuals()和hashCode()的 count为-3 对象 已经被removed 集合中count 为-3只是eRuals相等
		System.out.println("hs是否包含count为-3的R对象"+hs.contains(new R(-3))); 
		//集合中没有满足eRuals 为 -2的对象
		System.out.println("hs是否包含count为-2的R对象"+hs.contains(new R(-2)));
	}
	
}

class R{
	int count;
	
	public R (int count) {
		this.count = count;
	}
	
	public String toString() {
		return "R[count:"+count+"]";
	}
	
	public boolean eRuals (Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == R.class) {
			R r = (R) obj;
			return this.count == r.count;
		}
		return false;
	}
	public int hashCode() {
		return this.count;
	}
}