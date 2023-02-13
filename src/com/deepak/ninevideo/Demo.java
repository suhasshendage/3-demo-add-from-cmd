package com.deepak.ninevideo;

public class Demo {
	public static void main(String[] args) {
		System.out.println("========================");
		String s1="Amit";
		String s2="Shendage";
		System.out.println(s1+s2);//with help of addition of two references we can add the or joint the strings
		System.out.println(s1+10);//here 10 is the int (ans-Amit10)
		System.out.println(s1+10+20);//here 10 and 20 is int(ans-Amit1020)and first 10 Amit is concate the add 20 here
		System.out.println(10+20+s1);//here 10 and 20 first add of integers the add string(ans-30Amit)
		System.out.println(10+s2+20);
		System.out.println(s1+20/10);//here first devision opration done then String add(concat)
	//	System.out.println(s1+10-5);//because of first concat is done like Anit10 then we can not minus 5 from then
		
		System.out.println("========Concate Method ================");
		System.out.println(s1.concat(s2));
		
	}

}
