package com.vivek.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class StringUtil{
	public static void main(String args[]){
		//Scanner scanner = new Scanner(System.in);
		//String input = scanner.next();scanner.close();
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		String input = br.readLine();
		System.out.println("String "+input+ " has duplicate character: "+isDuplicateCharacterInString(input));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
private static boolean isDuplicateCharacterInString(String input){
boolean [] char_set = new boolean[128];
		for(int i=0; i < input.length(); i++){
			int value = input.charAt(i);
			if(char_set[value]){
				return true;
			}
			char_set[value]= true;
		}
		return false;

}
}
