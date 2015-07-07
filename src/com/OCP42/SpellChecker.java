package com.OCP42;
import java.util.*;
public class SpellChecker {
	public static void main(String[]args){
		Map<String,String> misspeltWords = new HashMap<String,String>();
		
		misspeltWords.put("calender", "calendar");
		misspeltWords.put("tomatos", "tomatoes");
		misspeltWords.put("existance", "existence");
		misspeltWords.put("aquiantance", "acquaintance");
		misspeltWords.put("kiler", "killer");
		
		String sentence = "Buy a calender for the your 2013 kiler";
		System.out.println("The given sentence is: "+ sentence);
		
		for(String word: sentence.split("\\W+")){
			System.out.println("The correct spelling for "+ word + " is: "+ misspeltWords.get(word));
		}
		
		Set<String>keys = misspeltWords.keySet();
		System.out.println("Misspelt words in spellchecker are :");
		System.out.println(keys);
	}
}
