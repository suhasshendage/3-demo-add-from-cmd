package com.deepak.fourteenvideo;

public class StringBuilderdemo {
	public static void main(String[] args) {
		
		System.out.println("========Stringbuilder empty consructor save only 16 charcter==========");
		StringBuilder sb=new StringBuilder();
		System.out.println(sb.capacity());//16
		
		System.out.println("==================Append + capacity method===============");
		StringBuilder sb3=new StringBuilder("");
		sb3.append("hello");
		System.out.println(sb3.capacity());
		
		System.out.println("==================length method===============");
		 StringBuilder sb4=new StringBuilder("deepak java");
		 System.out.println(sb4.length());			//ans-11
		
		 System.out.println("==================CharAt method===============");
		 StringBuilder sb6=new StringBuilder("deepak java");
		 System.out.println(sb6.charAt(3));		//p -here show the 3 no. index which chacter is present

		 System.out.println("==================Delete method===============");
		 StringBuilder sb7=new StringBuilder("deepak java");
		 System.out.println(sb7.delete(2, 5 ));//its delete from index no. 2 to (5-1)=4  ansis=dek java

		 System.out.println("==================Equal method===============");
		 StringBuilder sb8=new StringBuilder("deepak java");
		 StringBuilder sb9=new StringBuilder("deepak java");
		 System.out.println(sb8.equals(sb9));
		
		 System.out.println("==================indexOf method===============");
		 StringBuilder sb10=new StringBuilder("deepak java");
		 System.out.println(sb10.indexOf("a"));		//ans-4
		
		 System.out.println("==================insert method===============");
		 StringBuilder sb11=new StringBuilder("deepak java");
		 System.out.println(sb11.insert(3, "zzzz"));	//deezzzzpak java
		
		 System.out.println("==================Reverse method===============");
		 StringBuilder sb12=new StringBuilder("deepak java");
		 System.out.println(sb12.reverse());
		
		 System.out.println("==================Replace method===============");
		 StringBuilder sb13=new StringBuilder("deepak java");
		 System.out.println(sb13.replace(3, 6 ,"abc"));
		 
		 System.out.println("==================SubSequence method===============");
		 StringBuilder sb14=new StringBuilder("deepak java");
		 System.out.println(sb14.subSequence(4, 8));
		 
		 System.out.println("==================SubString method===============");
		 StringBuilder sb15=new StringBuilder("deepak java");
		 System.out.println(sb15.substring(3, 6));
		  
	}

}
