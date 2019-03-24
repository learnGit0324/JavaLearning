package com.adam.interfaceTest;
//��Printer��ʵ��Product��Output�ӿ�
public class Printer implements Product, Output{
	private String[] printData 
		= new String[MAX_CACHE_SIZE];
	//���Լ�¼��ӡ�ļ�¼��
	private int dataNum = 0;
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		//ֻҪ������ҵ���ͼ�����ӡ
		while(dataNum > 0){
			System.out.println("��ӡ����ӡ��"+printData[0]);
			//����ǰ��һλ��ʣ�����ӡ��������һ
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if(dataNum > MAX_CACHE_SIZE) {
			System.out.println("��ӡ��������");
		}else {
			printData[dataNum++] = msg;
		}
	}

	@Override
	public int getProductTime() {
		// TODO Auto-generated method stub
		return 45;
	}
	public static void main(String[] args) {
		//����һ��Print���󣬵���Outputʹ��
		Output o = new Printer();
		o.getData("���Java����");
		o.getData("Adam");
		o.out();
		o.print("Yanzi","Fengjia","Adam");
		o.test();
		o.out();
		//����һ��Printer���󣬵���Productʹ��
		Product p = new Printer();
		System.out.println(p.getProductTime());
	}

	public void foo() {
		// TODO Auto-generated method stub
		
	}
	
}
//����һ��product�ӿ�
interface Product{
	public abstract int getProductTime();
}
