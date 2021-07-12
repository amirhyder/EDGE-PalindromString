package com.systems.ltd;

public class StringPalindrome {
	   public static void main(String args[]) {
	      
		  String originalString = "civic";
	      Palindrom palindrom=new Palindrom();
	      boolean check= palindrom.checkPalindrom(originalString);
	      
	      if(check) {
	    	  System.out.println(originalString +" is palindrom");
	      }else {
	    	  System.out.println(originalString +" is not palindrom");
	      }
	      
	   }
	}
