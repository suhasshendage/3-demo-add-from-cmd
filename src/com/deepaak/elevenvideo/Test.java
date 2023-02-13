package com.deepaak.elevenvideo;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("============IndexOf method===========");
		String s= "deepak";
		System.out.println(s.indexOf('e'));//here show the e char position of index search from starting side	
		System.out.println(s.indexOf("pa"));//here show the e char position of index 
		
		System.out.println("============LastIndexOf method===========");
		String s1= "deepak";
		System.out.println(s1.lastIndexOf('p'));//here show the e char position of index search from last side
		
		System.out.println("============CharAt method===========");
		String s2= "deepak";
		System.out.println(s2.charAt(3));//ans-p
		
		System.out.println("============Contains method (its retrun boolean value===========");
		String s3= "deepak";
		System.out.println(s3.contains("ep"));//it will true because ep is present in String(true)
		System.out.println(s3.contains("s"));//it will false because s is present in String(false)
		System.out.println(s3.contains("ea"));//false
		
		System.out.println("============StartWith method (its retrun boolean value===========");
		String s4= "deepak";
		System.out.println(s3.startsWith("d"));//true
		System.out.println(s3.startsWith("D"));//false
		System.out.println(s3.startsWith("e"));//false
		
		
		System.out.println("============EndWith method (its retrun boolean value===========");
		String s5= "deepak";
		System.out.println(s5.endsWith("ak"));//true
		System.out.println(s5.endsWith("k"));//true
		System.out.println(s5.endsWith("AK"));//false
		System.out.println(s5.endsWith("e"));//false
		
		
		 
	}

}
