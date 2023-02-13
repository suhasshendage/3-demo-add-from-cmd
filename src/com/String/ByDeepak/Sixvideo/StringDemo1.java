  package com.String.ByDeepak.Sixvideo;

public class StringDemo1 
{
	public static void main(String[]args)
	{
	String s1=new String("suhas");//here create 2 objects one is heap memory and 2nd in SCP
	//String s2="suhas";//here only one object is created in SCP,
	
	System.out.println(s1.length());//here suhas lenth is 5
	
	System.out.println("=========Object is emety==========");
	//how to check String object is emety
	String s3=new String();
	System.out.println(s3.length());
	
	
	System.out.println("======StringfBuffer Class=============");
	
	StringBuffer sb=new StringBuffer("Shendage");   //its predefined class
	String s4=new String(sb);//here we can pass refrence of Sting buffer object 
	System.out.println(s4);
	
	
System.out.println("======StringfBuilder Class=============");
	
	StringBuilder stb=new StringBuilder("JBK");   //its predefined class
	String s5=new String(stb);//here we can pass refrence of Stingbuilder object 
	System.out.println(s5);
	
	System.out.println("======Byte constructor=============");
	
	byte[] b ={101,102,103};//here byte value converted in to character 
	String s6=new String(b);
	System.out.println(s6);
	
	
System.out.println("======Char constructor=============");
	
	char[] c ={'a','b','c','d'};//here char value converted in to character 
	String s7=new String(c); 
	System.out.println(s7);
	
	//why not creating the password in STRING? only created in char
	
	char [] s8=new char[]{'a','b','c'};
	String s9=new String("abc");
	System.out.println("s8=" +s8);
	System.out.println("s9=" +s9);
	
	
	
	
	
	}
}
	