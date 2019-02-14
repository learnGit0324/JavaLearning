package com.adam.Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		/**
		 * TreeSet elements has been sorted when added. 
		 * Sort by value of the inserted elements
		 */
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("B");
		ts.add("A");
		System.out.println(ts);
		//return the first set element
		System.out.println(ts.first());
		//return the last set element
		System.out.println(ts.last());
		//return the element less than the specify one
		ts.add("E");
		System.out.println(ts.lower("D"));
		System.out.println(ts.lower("F"));
		System.out.println(ts.lower("B"));
		//return the element more then the specify one
		System.out.println(ts.higher("D"));
		//return sub set of target Set, [fromElement, toElement)
		SortedSet<String> ts2 = ts.subSet("A", "B");
		System.out.println(ts2);
		ts2 = ts.subSet("A", "F");
		System.out.println(ts2);
		//hasSet(Object toElement) return the sub set that less than the toElement
		SortedSet<String> ts3 = ts2.headSet("E");
		System.out.println(ts3);
		//tailSet(Object fromElement) return the sub set that big than the fromElement
		SortedSet<String> ts4 = ts2.tailSet("B");
		System.out.println(ts4);
	}
}
