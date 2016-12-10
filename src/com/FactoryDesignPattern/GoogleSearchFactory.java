package com.FactoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author ryad22
 *
 *         This is factory class which is visible to client .Client does not
 *         bother and know the way objects are initialized. Client can ask any
 *         product from factory . (In this case I am Client ) Example :- Google
 *         Search API . I am using this API and i don't know how to initiate any
 *         type of search class object . I just want one object of any specific
 *         search type. (Let's say we have many type of searches . Example:-
 *         Person Search , News Search ,Image Search , Video Search) So in this
 *         case Google Search API will use Factory Design Pattern
 *
 *         This is useful when there are multiple products and we don't want
 *         that client needs to know how to initiate product object. So client
 *         only needs to provide type of class and object of class will be
 *         returned. Hiding the way objects are initialized
 * 
 *         So at dynamic time I will just ask object type from factory class and
 *         it will return me type of class
 *
 *
 *         Problems :- If I am going to create new class then I have to update
 *         factory class . Open Close Principle Violated.
 * 
 *         This Problem can be solved using hash map. Make this factory class
 *         more flexible and take class level Hash map. In starting put every
 *         type of object in this map . And if new product type arrived then
 *         first let product class implement Interface and then register this
 *         new Product in Map. Get anyProduct from getProductFromHashMap().
 *         (This is called Reflection)
 * 
 * 
 *         I am using interface which needs to be implemented by every product
 *         class so that we can return same type(Interface ) from getProduct()
 *         method. (Programming to Interface ) I can use abstract class as well.
 * 
 * 
 *         Now even we don't need to initiated factory class every time from
 *         let's say main method. We have two ways . 1. Either make getProduct()
 *         static 2. Use singleton pattern on this factory class
 * 
 *         Some Good Article on Factory Design :-
 *         http://stackoverflow.com/questions/14575457/factory-classes
 *         http://www.oodesign.com/factory-pattern.html
 *         http://www.journaldev.com/1392/factory-design-pattern-in-java
 * 
 *         I am not going to use singleton pattern in this class.
 */
public class GoogleSearchFactory {

	static Map<String, ISearchable> searchEnginesMap = SingletonInit.mapInstance;

	/**
	 * 
	 * Part of Singleton Pattern
	 * 
	 */
	public static GoogleSearchFactory getInstance() {
		return SingletonInit.googleSearchFactoryInstance;
	}

	/**
	 * Private Constructor Part of singleton Design
	 */
	private GoogleSearchFactory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * 
	 */
	public void registerSearchEngine(String name, ISearchable searchAble) {
		searchEnginesMap.put(name, searchAble);
	}

	/**
	 * This class will return product with their name Now problem is that there
	 * are multiple types of product , which one is to be returned . We will use
	 * interface and return type would be interface
	 * 
	 * @param name
	 */

	public ISearchable getProduct(String name) {
		ISearchable searchEngine = null;
		System.out.println(searchEnginesMap.size());
		try {
			if (searchEnginesMap.get(name) == null)
				throw new NoClassDefFoundError();
			searchEngine = searchEnginesMap.get(name).clone();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return searchEngine;

	}

	/**
	 * 
	 * Singleton design Part The best thing is that this method will be called
	 * only once No problem with Multi threading
	 * 
	 */
	private static class SingletonInit {
		private static final GoogleSearchFactory googleSearchFactoryInstance = new GoogleSearchFactory();
		private static Map<String, ISearchable> mapInstance = new HashMap<String, ISearchable>();
	}
}
