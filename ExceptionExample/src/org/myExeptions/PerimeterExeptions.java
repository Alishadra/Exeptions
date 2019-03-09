package org.myExeptions;

public class PerimeterExeptions extends Exception{

	public PerimeterExeptions() {
		super();
	}

	public PerimeterExeptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PerimeterExeptions(String message, Throwable cause) {
		super(message, cause);
	}

	public PerimeterExeptions(String message) {
		super(message);
	}

	public PerimeterExeptions(Throwable cause) {
		super(cause);
	}
	
	

}
