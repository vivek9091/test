package com.vivek.practise;

import java.util.HashMap;

public class PrintAlternateOccurence {

	public static void main(String[] args) {
		String input ="It is a long day Dear";
		printAlternateOccurenceOfCharacter(input);
	}

	private static void printAlternateOccurenceOfCharacter(String input) {
		String inputInLowerCase = input.toLowerCase();
		HashMap<Character,Integer> map= new HashMap<>();
		StringBuilder output= new StringBuilder();
		for(int i=0;i < input.length();i++){
			if(!map.containsKey(inputInLowerCase.charAt(i))){
				map.put(inputInLowerCase.charAt(i), 1);
				output.append(input.charAt(i));
			}else{
			if(map.get(inputInLowerCase.charAt(i)) == 1){
				map.put(inputInLowerCase.charAt(i), 0);
				continue;
			}
			else{
				output.append(input.charAt(i));
				map.put(inputInLowerCase.charAt(i), 1);
			}
			}		
		}
	System.out.println(output.toString());	
	}

}
