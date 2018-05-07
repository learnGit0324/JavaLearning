package com.adam.LambdaTest;

import com.adam.CommandModel.Command;
import com.adam.CommandModel.ProcessArray;
/**
 * Lambda���ʽ֧�ֽ��������Ϊ����������Lambda���ʽ����ʹ�ø����Ĵ���������ֻ��һ�����󷽷��Ľӿڵ�ʵ��
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
				System.out.println("����Ԫ�ص��ܺ��ǣ�"+sum);
			}
			
		});
	}
}
