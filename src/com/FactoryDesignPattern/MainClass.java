package com.FactoryDesignPattern;

public class MainClass {

	// Let's see How these are going to perform
	public static void main(String[] args) {
		GoogleSearchFactory factory = GoogleSearchFactory.getInstance();

		NewsSearch.register();

		ImageSearch imageSearch = (ImageSearch) factory.getProduct("ImageSearch");
		imageSearch.setName("WorldCup2011");
		imageSearch.setType("JPG");
		ImageSearch imageSearch2 = (ImageSearch) factory.getProduct("ImageSearch");
		System.out.println(imageSearch2.getName());

	}
}
