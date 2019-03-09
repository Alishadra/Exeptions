package org.myExeptions;

public class Perimeter {
	
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) throws PerimeterExeptions {
		if (side <= 0) {
			throw new PerimeterExeptions("Enter is Incorrect");
		}
		this.side = side;
	}
	
	

}
