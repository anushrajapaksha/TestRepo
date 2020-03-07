package com.abc;

public class Assignment {

	Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}
	
	void write(String ss) {
		
		p.write(ss);
	}
}
