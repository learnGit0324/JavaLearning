package com.adam.AbstractFactoryTest;

public class BlackAnimalFactory implements IAnimalFactory{

	@Override
	public ICat createCat() {
		// TODO Auto-generated method stub
		return new BlackCat();
	}

	@Override
	public IDog createDog() {
		// TODO Auto-generated method stub
		return new BlackDog();
	}

	@Override
	public ISheep creatSheep() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
