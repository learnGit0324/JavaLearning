package com.adam.Abstract;

public class CarSpeedMeter extends SpeedMeter{
	//radius °ë¾¶
	private double radius;
	public CarSpeedMeter(double radius){
		this.radius =radius;
	}
	public double calgirth(){
		return radius * 2 * Math.PI;
	}
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter(0.34);
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
}
