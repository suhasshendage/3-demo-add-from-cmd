package com.deepak.telvevideo;

public class Demo {
	public static void main(String[] args) {
		
		System.out.println("===================Uppercase method==================");
		String s= "deepak";
		System.out.println(s.toUpperCase());//it will convert lower case to upper case(ans-DEEPAK)
		
		System.out.println("===================lowercase method==================");
		String s1= "DEEPAK";
		System.out.println(s.toLowerCase());//it will convert  upper case TOlower case (ans-deepak)
		

		System.out.println("===================valueof()  method==================");
		int a=10, b=20;
		System.out.println(a+b);//30
		String s3=String.valueOf(a);
		String s4=String.valueOf(b);
		System.out.println(s3+s4);   //1020(here not addition done just concate is working)
		
		System.out.println("===================toCharArrayof()  method==================");
		char [] c= s1.toCharArray();
		System.out.println(c);
		
		
	}

}
