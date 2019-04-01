package com.adam.chapter9;
/**
 * 
 * @author JianangZhao
 * @function 带泛型声明的Apple<T>类，使用Apple<T>类时就可为T形参传入实际类型，这样就可以生成如Apple<String>/Apple<Double>...形式的多个逻辑子类
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
		//由于传给T形参的是String，所以构造器参数只能是String
		Apple<String> a1 = new Apple<>("苹果");
		System.out.println(a1.getInfo());
		//由于传递给T形参的是Double，所以构造器参数只能是Double或double
		Apple<Double> a2 = new Apple<>(5.67);
		System.out.println(a2.getInfo());
	}
	
}
