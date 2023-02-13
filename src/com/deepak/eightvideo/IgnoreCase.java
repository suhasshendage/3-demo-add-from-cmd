package com.deepak.eightvideo;

public class IgnoreCase {
	
	public static void main(String[] args) {
		String s1="deepak";
		String s2="Deepak";
		String s3="DEEPAK";
		System.out.println(s1.equals(s2));
		
		
		System.out.println("======Ignorecase Method=============");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
 