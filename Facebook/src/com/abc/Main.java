package com.abc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment as = new Assignment();
		
		Pen p = new PenAdapter();
		as.setP(p);
		as.write("Hello Adapter");
		
		
		
	}

}
