package com.zeke.Dictionary;

public class Word {
	private String name;
	
	public Word(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((Word) obj).getName()) {
			return true;
		}else {
			return false;
		}
	}
}
