package com.adam.Set;

import java.util.TreeSet;

public class TreeSetTest4 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Q(5));
		ts.add(new Q(-3));
		ts.add(new Q(9));
		ts.add(new Q(-2));
		//��ӡts���ϣ�����Ԫ���������
		System.out.println(ts);	
		//ȡ����һ��Ԫ��
		Q first = (Q) ts.first();
		first.count = 20;
		//ȡ�����һ��Ԫ��
		Q last = (Q) ts.last();
		//�����һ��Ԫ�ص�count��ֵ����ڶ���Ԫ�ص�count��ͬ
		last.count = -2;
		//�ٴ����������TreeSet���Ԫ�ش�������״̬�������ظ�Ԫ��
		System.out.println(ts);
		//ɾ��ʵ���������ı��Ԫ�أ�ɾ��ʧ��
		System.out.println(ts.remove(new Q(-2)));
		System.out.println(ts);
		//ɾ��ʵ���������ı��Ԫ�أ�ɾ���ɹ�
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
	
	//��дequals()������ ����count���ж��Ƿ����
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