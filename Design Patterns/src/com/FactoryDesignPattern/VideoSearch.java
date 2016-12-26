package com.FactoryDesignPattern;

public class VideoSearch implements ISearchable {
	public String name;
	public String type;

	static{
		GoogleSearchFactory.getInstance().registerSearchEngine("VideoSearch",(new ImageSearch()));
		
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

	@Override
	public VideoSearch clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (VideoSearch) super.clone();
	}

}
