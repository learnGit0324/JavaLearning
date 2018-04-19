package com.adam.Abstract;

public abstract class SpeedMeter {
	//转速
	private double turnRate;
	public SpeedMeter(){}
	//把计算车轮周长的方法定义为抽象方法
	public abstract double calgirth();
	public void setTurnRate(double turnRate) {
		// TODO Auto-generated method stub
		this.turnRate = turnRate;
	}
	//定义计算速度的通用算法
	public double getSpeed(){
		return calgirth() * turnRate;
	}
}
