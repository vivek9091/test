package com.vivek.practise;

public class URLify {
	public String replaceSpaces(String input){
		String[] splittedString = input.trim().split(" ");
		String lastString = splittedString[splittedString.length-1].trim();
		StringBuilder output = new StringBuilder();
		for(String s : splittedString){
			if(s.isEmpty()) continue;
			output.append(s.trim());
			if(!s.trim().equals(lastString.trim())){
				output.append("%20");
			}
		}
		return output.toString();
	}
	
	public String replaceUrlSpaces(char []input,int trueLength){
		int spaceCount =0;
		for(int i=0 ; i < trueLength ; i++){
			if(input[i] == ' ') 
				spaceCount++;
		}
		System.out.println(spaceCount);
		int index = trueLength + spaceCount * 2;
		System.out.println(index);
		if(trueLength < input.length) input[trueLength] = '\0';
		for(int i = trueLength-1 ; i >= 0 ; i--){
			if (input[i] == ' '){
				input[index-1]='0';
				input[index-2]='2';
				input[index-3]='%';
				index = index -3;
				
			}else{
				input[index-1]=input[i];
				index--;
			}
		}
		
		return new String (input);
	}
}
