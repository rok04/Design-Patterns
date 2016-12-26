package com.FactoryDesignPattern;

public class NewsSearch implements ISearchable, Cloneable {
	public String name;
	public String type;
	{
		
		GoogleSearchFactory.getInstance().registerSearchEngine("NewsSearch",(new NewsSearch()));
	}
	// Lets call it whenever this class loads 
	public static void register()
	{
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public NewsSearch() {

	}
	@Override
	public NewsSearch clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (NewsSearch) super.clone();
	}

}
