package com.deepak.sisxteenvideo;

public class ProgramPractice {
	public static void main(String[] args) {
		String s="madam";
		String rev="";
		for (int i = s.length()-1; i >=0 ; i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println("not a palindrome String ");
		}
	}

}
