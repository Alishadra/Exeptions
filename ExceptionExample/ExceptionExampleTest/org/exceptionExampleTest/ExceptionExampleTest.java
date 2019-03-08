package org.exceptionExampleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.exceptionExample.Square;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ExceptionExampleTest {

	@Test
	void tesgetShow() {
		
		int result = Square.getShow();
		
		try {
			assertEquals(0,result );
		} catch (Exception e) {

		e.equals("На 0 не делим");
		}
		
	}

}
