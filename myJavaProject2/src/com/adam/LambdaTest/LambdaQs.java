package com.adam.LambdaTest;

public class LambdaQs {
	//
	
	public static void main(String[] args) {
		LambdaQs lq = new LambdaQs();
		//Lambda���ʽֻ��һ����䣬����ʡ�Ի�����
		lq.eat(() -> {System.out.println("ƻ����ζ������");});
		lq.drive(weather ->{
			System.out.println("���������ǣ�"+weather);
			System.out.println("ֱ����ƽ�ȷ���");
		});
		lq.test((a,b) -> a+b);
	}

	private void test(Addable add) {
		// TODO Auto-generated method stub
		System.out.println("3��5�ĺ�Ϊ��"+add.add(3, 5));
	}

	private void drive(Flyable f) {
		// TODO Auto-generated method stub
		System.out.println("�����ڼ�ʻ��"+f);
		f.fly("���̿���ϴ�����ա�");
	}

	private void eat(Eatable e) {
		// TODO Auto-generated method stub
		//���ø÷�����ҪEatable����
		System.out.println(e);
		e.taste();
		
	}
}
interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}
interface Addable{
	int add(int a, int b);
}