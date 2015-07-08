package com.OCP47;

public class ParseString1 {
	public static void main(String[]args){
		String quote = "Never lend books - nobody ever returns them!";
		String[]word = quote.split(" ");
		for(String words: word){
			System.out.println(words);
		}
	}
}
