package com.adam.AbstractFactoryTest;

public class WhiteAnimalFactory implements IAnimalFactory{

	@Override
	public ICat createCat() {
		// TODO Auto-generated method stub
		return new WhiteCat();
	}

	@Override
	public IDog createDog() {
		// TODO Auto-generated method stub
		return new WhiteDog();
	}

	@Override
	public ISheep creatSheep() {
		// TODO Auto-generated method stub
		return new WhiteSheep();
	}
	
}
