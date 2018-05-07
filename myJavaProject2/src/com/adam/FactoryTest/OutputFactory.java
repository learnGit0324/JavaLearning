package com.adam.FactoryTest;

import com.adam.interfaceTest.Output;
import com.adam.interfaceTest.Printer;

public class OutputFactory {
	public Output getoutput() {
		return new Printer();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getoutput());
		c.keyIn("·è¿ñJava½²Òå");
		c.print();
	}

}
