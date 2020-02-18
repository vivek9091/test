package com.vivek.practise;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		int array[]= {2,6,1,9,4,5,3,23,25,24,26,27,28,29};
		int count=longestConsecutiveSubsequence(array);
		System.out.println("Longest consecutive subsequence in array" +array+" is:"+count);

	}

	private static int longestConsecutiveSubsequence(int[] array) {
		Set<Integer> x= new HashSet<Integer>();int max=0;int currentmax=0;
		for(int i=0;i < array.length;i++){
			x.add(array[i]);			
		}
		for(int i : x){
			System.out.print(i+ " ");
			if(x.contains(i-1)){
				continue;
			}
			
			do{
				currentmax++;
			}while(x.contains(++i));
			if(currentmax > max){
				max=currentmax;
			}
			if(max >= array.length/2)
				break;
			currentmax=0;
		}
		return max;
	}

}
