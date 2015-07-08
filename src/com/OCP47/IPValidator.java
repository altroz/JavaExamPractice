package com.OCP47;

import java.util.regex.Pattern;

public class IPValidator {
	void validateIP(String ipStr){
		String regex = "\\b(25[0-5]2[0-4]\\d[01]?\\d[01]?\\d\\d?)(\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d\\d?)\\b";
		System.out.println(ipStr + " is valid ?" + Pattern.matches(regex, ipStr));
	}
	
	public static void main(String[]args){
		String ipStr1 = "255.245.188.123";
		String ipStr2 = "255.245.188.273";
		
		IPValidator validate = new IPValidator();
		validate.validateIP(ipStr1);
		validate.validateIP(ipStr2);
	}
}
