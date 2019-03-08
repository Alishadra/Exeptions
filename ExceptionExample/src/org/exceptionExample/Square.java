package org.exceptionExample;

public class Square {
	
	private static int side;
	
	public static int getShow() {
		
		int show = side/side;
		return show;
		
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	

}
