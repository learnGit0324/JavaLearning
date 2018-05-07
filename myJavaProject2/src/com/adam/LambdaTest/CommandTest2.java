package com.adam.LambdaTest;

import com.adam.CommandModel.ProcessArray;

public class CommandTest2 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,4,6};
		//当使用Lambda表达式时，不再需要new Xxx(){}这样繁琐的代码
		//也不需要支出重写的方法，也不需要给出重写方法的返回值类型
		//只需要给出重写的方法括号以及括号里的形参列表即可
		pa.process(array, (int[] target) -> {
			int sum = 0;
			for(int tmp:target) {
				sum += tmp;
			}
			System.out.println("数组元素的总和 是："+sum);
		});
	}
}
