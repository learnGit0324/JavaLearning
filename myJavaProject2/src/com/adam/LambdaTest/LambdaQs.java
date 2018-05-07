package com.adam.LambdaTest;

public class LambdaQs {
	//
	
	public static void main(String[] args) {
		LambdaQs lq = new LambdaQs();
		//Lambda表达式只有一条语句，可以省略花括号
		lq.eat(() -> {System.out.println("苹果的味道不错");});
		lq.drive(weather ->{
			System.out.println("今天天气是："+weather);
			System.out.println("直升机平稳飞行");
		});
		lq.test((a,b) -> a+b);
	}

	private void test(Addable add) {
		// TODO Auto-generated method stub
		System.out.println("3和5的和为："+add.add(3, 5));
	}

	private void drive(Flyable f) {
		// TODO Auto-generated method stub
		System.out.println("我正在驾驶："+f);
		f.fly("【碧空如洗的晴日】");
	}

	private void eat(Eatable e) {
		// TODO Auto-generated method stub
		//调用该方法需要Eatable对象
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