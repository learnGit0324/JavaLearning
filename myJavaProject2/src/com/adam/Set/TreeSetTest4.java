package com.adam.Set;

import java.util.TreeSet;

public class TreeSetTest4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Q(5));
		ts.add(new Q(-3));
		ts.add(new Q(9));
		ts.add(new Q(-2));
		//打印ts集合，集合元素是有序的
		System.out.println(ts);	
		//取出第一个元素
		Q first = (Q) ts.first();
		first.count = 20;
		//取出最后一个元素
		Q last = (Q) ts.last();
		//对最后一个元素的count赋值，与第二个元素的count相同
		last.count = -2;
		//再次输出将看到TreeSet里的元素处于无序状态，且有重复元素
		System.out.println(ts);
		//删除实例变量被改变的元素，删除失败
		System.out.println(ts.remove(new Q(-2)));
		System.out.println(ts);
		//删除实例变量被改变的元素，删除成功
		System.out.println(ts.remove(new Q(5)));
		System.out.println(ts);
	}
}

class Q implements Comparable{
	
	int count;
	
	public Q(int count) {
		this.count = count;
	}
	
	public String toString() {
		return "R[count:"+count+"]";
	}
	
	//重写equals()方法， 根据count来判断是否相等
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Q.class) {
			Q r = (Q) obj;
			return r.count == this.count;
		}
		return false;
	}
	
	@Override
	public int compareTo(Object obj) {
		Q r = (Q) obj;
		return count > r.count ? 1: count < r.count ? -1 : 0;
	}
	
}