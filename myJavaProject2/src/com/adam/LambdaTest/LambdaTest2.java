package com.adam.LambdaTest;

public class LambdaTest2 {	
	public static void main(String[] args) {
		//Lambda��Ŀ�����ͱ�������ȷ�ĺ���ʽ�ӿ�
		//Lambda���ʽֻ��Ϊ����ʽ�ӿڴ�������
		
		//1 ��Lambda���ʽ��ֵ������ʽ�ӿ����͵ı���
		Runnanle r = () ->{
			int sum = 0;
			for(int i = 0; i<100; i++) {
				sum += i;
			}
			System.out.println(sum);
		};
		r.test();
		//2 ��Lambda���ʽ��Ϊ����ʽ�ӿ����͵Ĳ�������ĳһ������
		LambdaTest2 lt2 = new LambdaTest2();
		lt2.getTest(() ->{
			System.out.println("��Lambda���ʽ��Ϊ����ʽ�ӿ����͵Ĳ�������ĳһ������");
		});
		//ʹ�ú���ʽ�ӿڶ�Lambda���ʽǿ������ת��
		Object obj =(Runnanle)() -> {
			System.out.println("ʹ�ú���ʽ�ӿڶ�Lambda���ʽǿ������ת��");
		};
		
	} 
	public void getTest(Runnanle r) {
		r.test();
	}
	//ͬ����Lambda���ʽ���Ա�������ͬ��Ŀ�����ͣ�
	//Ψһ��Ҫ����Lambda���ʽ���β��б��뺯��ʽ�Ľӿ���Ψһ�ĳ��󷽷����β������ͬ
	Object obj2 = (FkTest)() -> {
		for(int i =0; i < 10; i++) {
			System.out.println();
		}
	};
}
interface Runnanle{
//	int a = 5;
	void test();
}
@FunctionalInterface
interface FkTest{
	void test();
}