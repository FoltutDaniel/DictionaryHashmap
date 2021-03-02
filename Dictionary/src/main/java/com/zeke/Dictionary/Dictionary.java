package com.zeke.Dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Dictionary {
	private HashMap<Word, Definition> hashMap;
	
	public Dictionary(HashMap<Word, Definition> hashMap) {
		this.hashMap = hashMap;
	}
	
	public Dictionary() {
		this.hashMap = new HashMap<>();
	}
	
	public void addWord(Word w, Definition d) {
		this.hashMap.put(w, d);
	}
	
	public Definition getDefinition(Word w) {
		for( Word key : this.hashMap.keySet()) {
			if(key.getName().equals(w.getName())) {
				return this.hashMap.get(key);
			}
		}
		return null;
	}
	
	public Set<Word> getAllWords(){
		return this.hashMap.keySet();
	}
	
	public ArrayList<Definition> getAllDefinitions(){
		ArrayList<Definition> definitions = new ArrayList<>(this.hashMap.values());
		return definitions;
	}
}
