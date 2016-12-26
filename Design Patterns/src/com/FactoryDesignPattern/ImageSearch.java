package com.FactoryDesignPattern;

public class ImageSearch implements ISearchable, Cloneable {
	public String name;
	public String type;
	// Lets call it whenever this class loads 
	
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

	
	@Override
	public ImageSearch clone() throws CloneNotSupportedException {
		return (ImageSearch) super.clone();
	}

}
