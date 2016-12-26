package com.SingeltonPattern;

public class Main {
	public static void main(String[] args) {

		SingletonPatternClass s1 = SingletonPatternClass.getInstance1();
		SingletonPatternClass s2 = SingletonPatternClass.getInstance1();
		SingletonPatternClass s3 = SingletonPatternClass.getInstance2();
		SingletonPatternClass s4 = SingletonPatternClass.getInstance2();
		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);

	}

}
