package com.SingeltonPattern;

public class SingletonPatternClass {

	private static SingletonPatternClass product;

	private SingletonPatternClass() { // Private Constructor prevent new object
										// construction

	}

	////////////////////////////////////////////////////////////////////////////
	/*
	 * Problem :- Now this will not handled in multi thread application
	 */
	public static SingletonPatternClass getInstance1() {
		if (product != null)
			return product;
		else {
			return product = new SingletonPatternClass();
		}
	}

	///////////////////////////////////////////////////////////////////////////////
	/*
	 * Problem solved in case of multi threading Problem :- Slow
	 */
	public static SingletonPatternClass getInstance2() {
		if (product != null)
			return product;
		else {
			synchronized (SingletonPatternClass.class) {
				if (product == null) // double checked instance
					product = new SingletonPatternClass();
				return product;
			}
		}
	}

	//////////////////////////////////////////////////////////////////////////////////
	/*
	 * Best Way :-)
	 */
	public static SingletonPatternClass getInstance3() {
		return innerClass.innerInstance;

	}

	/**
	 * This is static class and now it will get initiated only once
	 */
	private static class innerClass {
		/// Class level instance only initiate once
		// Good replacement of multi threading .
		// This class is called every time but object is created only once
		public static final SingletonPatternClass innerInstance = new SingletonPatternClass();

	}
}
