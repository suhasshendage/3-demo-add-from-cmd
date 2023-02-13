package com.deepak.ninevideo;

public class JoinMethod {
	public static void main(String[] args) {

		System.out.println("========Join Method=========");
		String s1="Amit";
		String s2="Shendage";
		
		System.out.println(String.join(",", s1,s2));
		System.out.println(String.join("  :", s1,s2));
		System.out.println(String.join("  :", s1,s2,s1));
		System.out.println(String.join("ffdfd", s1,s2,s1));
		
		System.out.println("========SubSequence method=========");
		String s3="this is demo";
		System.out.println(s3.subSequence(2, 9));  //here strarted from index 2 and end with 9
		
		
		System.out.println("========SubString method single arguments pass=========");
		String s4="this is demo";
		System.out.println(s4.substring(3));
		
		System.out.println("========SubString method two arguments pass=========");
		String s5="this is demo";
		System.out.println(s4.substring(2, 9));
		
	}

}
