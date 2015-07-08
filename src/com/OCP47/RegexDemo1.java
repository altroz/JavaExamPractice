package com.OCP47;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[]args){
		String str = "Danny Doo, Flat no 502, Big Apartment, Wide Road, Near Huge Milestone, Hugo-city 56100,"
				+ "PH 2134015397, email: dannyword@world.com, Maggi Myer, Post Bang no 54, Big Bank Post Office,"
				+ "Big Bank City 86000, PH 2134018499, email: naggi07@myuniverse.com.";
		
		Pattern pattern = Pattern.compile("\\w+@\\w+\\.com");
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
