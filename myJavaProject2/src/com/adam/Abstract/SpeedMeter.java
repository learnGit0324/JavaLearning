package com.adam.Abstract;

public abstract class SpeedMeter {
	//ת��
	private double turnRate;
	public SpeedMeter(){}
	//�Ѽ��㳵���ܳ��ķ�������Ϊ���󷽷�
	public abstract double calgirth();
	public void setTurnRate(double turnRate) {
		// TODO Auto-generated method stub
		this.turnRate = turnRate;
	}
	//��������ٶȵ�ͨ���㷨
	public double getSpeed(){
		return calgirth() * turnRate;
	}
}
