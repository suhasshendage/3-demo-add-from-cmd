package com.deepak.thirteeenvideo;

public class StringBufferDemo {
	public static void main(String[] args) {
		System.out.println("========Stringbuffer empty consructor save only 16 charcter==========");
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16
		
		
		StringBuffer sb1=new StringBuffer("deepak");
		System.out.println(sb1.capacity()); //16(default) + 6 (deepak)length==ans==>22
		

		StringBuffer sb2=new StringBuffer(1000);
		System.out.println(sb2.capacity());
		
		
		 System.out.println("==================Append + capacity method===============");
		StringBuffer sb3=new StringBuffer("");
		sb3.append("hello");
		System.out.println(sb3.capacity());
		
		
		sb3.append("hello javaaa"); 		//(16(old capacity)*2)+2
		System.out.println(sb3.capacity());
		
		
		 System.out.println("==================length method===============");
		 StringBuffer sb4=new StringBuffer("deepak java");
		 System.out.println(sb4.length());			//ans-11
		 
		
		 System.out.println("==================length method===============");
		 StringBuffer sb5=new StringBuffer("deepak java");
		 System.out.println(sb5.append("hi"));	//its work as a concate add the arguments in before one
		
		 System.out.println("==================CharAt method===============");
		 StringBuffer sb6=new StringBuffer("deepak java");
		 System.out.println(sb6.charAt(3));		//p -here show the 3 no. index which chacter is present

		 System.out.println("==================Delete method===============");
		 StringBuffer sb7=new StringBuffer("deepak java");
		 System.out.println(sb7.delete(2, 5 ));//its delete from index no. 2 to (5-1)=4  ansis=dek java

		 System.out.println("==================Equal method===============");
		 StringBuffer sb8=new StringBuffer("deepak java");
		 StringBuffer sb9=new StringBuffer("deepak java");
		 System.out.println(sb8.equals(sb9));
		
		 System.out.println("==================indexOf method===============");
		 StringBuffer sb10=new StringBuffer("deepak java");
		 System.out.println(sb10.indexOf("a"));		//ans-4
		 
		 System.out.println("==================insert method===============");
		 StringBuffer sb11=new StringBuffer("deepak java");
		 System.out.println(sb11.insert(3, "zzzz"));	//deezzzzpak java
		
		 System.out.println("==================Reverse method===============");
		 StringBuffer sb12=new StringBuffer("deepak java");
		 System.out.println(sb12.reverse());
		
		 System.out.println("==================Replace method===============");
		 StringBuffer sb13=new StringBuffer("deepak java");
		 System.out.println(sb13.replace(3, 6 ,"abc"));
		 
		 System.out.println("==================SubSequence method===============");
		 StringBuffer sb14=new StringBuffer("deepak java");
		 System.out.println(sb14.subSequence(4, 8));
		 
		 System.out.println("==================SubString method===============");
		 StringBuffer sb15=new StringBuffer("deepak java");
		 System.out.println(sb15.substring(3, 6));
		  
		 
		 
		 
		 
	}

}
