package com.String.ByDeepak.Sevenvideo;

public class Test {
	public static void main(String[]args){
		
		
		System.out.println("========length method================");
		String name=null;
		String email="abc@gmai.com";
		String pass="abc123";
		//System.out.println("name="+name.length());// it will give null point exceptopn because of lenth()
		System.out.println("email="+email.length());
		System.out.println("pass="+pass.length());
		
		
		System.out.println("========isEmpty method================");
		
		String name1="abc";
		String email1="abc@gmai.com";
		String pass1="abc123";
		String s="";
		System.out.println("name="+name1.isEmpty());// is empty method will give boolean value (true or false)
		System.out.println("email="+email1.isEmpty());//is empty method will give boolean value (true or false)
		System.out.println("pass="+pass1.isEmpty());//is empty method will give boolean value (true or false)
		
		System.out.println("pass="+s.isEmpty());	//it will give true value. 
		
		
		System.out.println("========trim method================");
		String name2="abc    xyz   ";
//		String email2="abc@gmai.com";
//		String pass2="abc123";
		String s4=name2.trim();
		System.out.println(name2.length());
		System.out.println(s4); 
		System.out.println(name2.length());
		System.out.println(name2.trim().length());
		
		
	}

}
