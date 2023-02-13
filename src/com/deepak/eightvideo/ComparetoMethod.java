package com.deepak.eightvideo;

public class ComparetoMethod {
		public static void main(String[] args) {
			System.out.println("============Comapare to method============");//this method apply from lecxikografically method
			String s1="a";
			String s2="A";
			System.out.println(s1.compareTo(s2));
			
			System.out.println("========================================================");
			String s3="A";
			String s4="a";
			System.out.println(s3.compareTo(s4));
			
			System.out.println("========================================================");
			String s5="aAc";
			String s6="aac";
			System.out.println(s5.compareTo(s6));
			
			System.out.println("================both String same literal===============");
			String s7="a";
			String s8="a";
			System.out.println(s7.compareTo(s8));//it provide zero comparison is zero
			
			
			System.out.println("============ComaparetoIgnore method============");
			String s9="b";
			String s10="c";
			System.out.println(s9.compareToIgnoreCase(s10));//Here comparison bet b and c only means ignore the upper case of a and A
			
		}
}
