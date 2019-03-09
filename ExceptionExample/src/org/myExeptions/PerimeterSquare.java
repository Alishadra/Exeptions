package org.myExeptions;

import org.exceptionExample.Square;

public class PerimeterSquare {
	
	public void getPerimeter() {
		
		Perimeter perimeter = new Perimeter();
		
		try {
			perimeter.setSide(0);
		} catch (PerimeterExeptions e) {
			System.err.println(e.getMessage());
		}
		
	}

}
