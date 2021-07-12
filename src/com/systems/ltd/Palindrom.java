package com.systems.ltd;

public class Palindrom {
	
	public boolean checkPalindrom(String str) {
		StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        String reversedString = buffer.toString();
        if(str.equals(reversedString)){
        	return true;
        } else {
        	return false;
        }
	}

}
