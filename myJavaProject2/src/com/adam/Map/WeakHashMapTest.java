package com.adam.Map;

import java.util.WeakHashMap;

/**
	 * @function WeakHashMap的key只保留了对实际对象的弱引用
	 * @author zhaoj
	 *
	 */
public class WeakHashMapTest {
	public static void main(String[] args) {
		WeakHashMap whm = new WeakHashMap();
		whm.put(new String("语文"), new String("良好"));
		whm.put(new String("数学"), new String("及格"));
		whm.put(new String("英语"), new String("中等"));
		
		whm.put("Java", new String("中等"));
		
		System.out.println(whm);
		//通知系统 立即进行来及回收
		System.gc();
		System.runFinalization();
		//将只看到一个key-value对
		System.out.println(whm);
	}
}
