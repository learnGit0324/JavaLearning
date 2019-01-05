package com.adam.AbstractFactoryTest;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
		IDog blackDog = blackAnimalFactory.createDog();
		blackDog.eat();
		ICat blackCat = blackAnimalFactory.createCat();
		blackCat.eat();
		IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
		IDog whiteDog = whiteAnimalFactory.createDog();
		whiteDog.eat();
		ICat whiteCat = whiteAnimalFactory.createCat();
		whiteCat.eat();
		ISheep whiteSheep = whiteAnimalFactory.creatSheep();
		whiteSheep.eat();
	}

}
