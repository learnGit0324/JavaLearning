package com.adam.interfaceTest;
//让Printer类实现Product和Output接口
public class Printer implements Product, Output{
	private String[] printData 
		= new String[MAX_CACHE_SIZE];
	//用以记录打印的记录数
	private int dataNum = 0;
	
	@Override
	public void out() {
		// TODO Auto-generated method stub
		//只要还有作业，就继续打印
		while(dataNum > 0){
			System.out.println("打印机打印："+printData[0]);
			//数组前移一位，剩余待打印的数量减一
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		// TODO Auto-generated method stub
		if(dataNum > MAX_CACHE_SIZE) {
			System.out.println("打印队列已满");
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
		//创建一个Print对象，当成Output使用
		Output o = new Printer();
		o.getData("疯狂Java讲义");
		o.getData("Adam");
		o.out();
		o.print("Yanzi","Fengjia","Adam");
		o.test();
		o.out();
		//创建一个Printer对象，当成Product使用
		Product p = new Printer();
		System.out.println(p.getProductTime());
	}

	public void foo() {
		// TODO Auto-generated method stub
		
	}
	
}
//定义一个product接口
interface Product{
	public abstract int getProductTime();
}
