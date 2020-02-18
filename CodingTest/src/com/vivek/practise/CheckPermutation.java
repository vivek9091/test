package com.vivek.practise;

import java.util.Arrays;

public class CheckPermutation {

	public boolean checkPermutation(String source , String to){
		if(source.length() != to.length()) return false;
		//First solution using java library methods
		/*return sort(source.toLowerCase()).equals(sort(to.toLowerCase()));
		
		String sort(String content){
			char[] s = content.toCharArray();
			Arrays.sort(s);
			return new String(s);
		}*/
		
		//Second solution without java library methods
		int [] letters = new int[128];
		char[] char_set = source.toCharArray();
		for(char c : char_set){
			letters[c]++;
		}
		for(int i = 0; i < to.length() ; i++){
			int value = to.charAt(i);
			letters[value]--;
			if(letters[value] < 0) return false;
		}
		return true;
	}

}
