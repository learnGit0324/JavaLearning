package com.adam.LambdaTest;

import com.adam.CommandModel.Command;
import com.adam.CommandModel.ProcessArray;
/**
 * Lambda表达式支持将代码块作为方法参数，Lambda表达式允许使用更简洁的代码来创建只有一个抽象方法的接口的实例
 * @author zhaoj
 *
 */
public class CommandTest {
	public static void main(String[] args) {
		int[] target = {3,-4,6,4};
		ProcessArray pa = new ProcessArray();
		pa.process(target, new Command() {

			@Override
			public void process(int[] target) {
				// TODO Auto-generated method stub
				int sum = 0;
				for(int tmp:target) {
					sum += tmp;
				}
				System.out.println("数组元素的总和是："+sum);
			}
			
		});
	}
}
