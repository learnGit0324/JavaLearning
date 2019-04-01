package com.adam.chapter9;
/**
 * 
 * @author JianangZhao
 * @function ������������Apple<T>�࣬ʹ��Apple<T>��ʱ�Ϳ�ΪT�βδ���ʵ�����ͣ������Ϳ���������Apple<String>/Apple<Double>...��ʽ�Ķ���߼�����
 * @param <T>
 */
public class Apple<T> {
	private T info;

	public Apple() {}
	
	public Apple(T info) {
		super();
		this.info = info;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	public static void main(String[] args) {
		//���ڴ���T�βε���String�����Թ���������ֻ����String
		Apple<String> a1 = new Apple<>("ƻ��");
		System.out.println(a1.getInfo());
		//���ڴ��ݸ�T�βε���Double�����Թ���������ֻ����Double��double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}
	
}
