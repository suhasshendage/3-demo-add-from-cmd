package com.deepak.tenVideo;

public class Test {
	public static void main(String[] args) {
		
		
		System.out.println("===============Replace Method==========");
		String s="this is demo";
		System.out.println(s.replace("is", "was"));
		System.out.println(s.replace("de", "vi"));
		
		System.out.println("===============ReplaceFirst Method==========");
		String s1="this is demo";
		System.out.println(s.replaceFirst("is ", "was"));//ans-thwasis demo
		
		System.out.println("===============ReplaceAll Method==========");
		String s2="this is demo";
		System.out.println(s.replaceAll("is", "was"));
	
		System.out.println("===============ReplaceAll regax  Method==========");
		String s3="this is demo";
		System.out.println(s3.replaceAll("is(.)", "was"));//regex (.) use then it replace the String and sapce is removed
		System.out.println(s3.replaceAll("is(.*)", "was"));//regax (.*) use then all string remove the replace word
		
		
		
	}

}
