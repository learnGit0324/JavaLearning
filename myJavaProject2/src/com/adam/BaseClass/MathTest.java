package com.adam.BaseClass;

public class MathTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*----三角运算----*/
		//将弧度转换为角度
		System.out.println(Math.toDegrees(1.57));
		//将角度转为弧度
		System.out.println(Math.toRadians(90));
		//绝对值
		System.out.println(Math.abs(-9));
		//计算反正切
		System.out.println(Math.asin(0.8));
		//正弦
		System.out.println(Math.sin(1.57));
		//取整，返回小于目标的最大值
		System.out.println(Math.floor(12.3));
		//取整，返回大于目标的最小值
		System.out.println(Math.ceil(12.3));
		//四舍五入
		System.out.println(Math.round(12.3));
		//计算平方根
		System.out.println(Math.sqrt(4));
		//计算立方根
		System.out.println(Math.cbrt(8));
		//计算乘方
		System.out.println(Math.pow(2, 4));
		/*----更多的函数在需要使用时查阅API即可---*/
	}

}
