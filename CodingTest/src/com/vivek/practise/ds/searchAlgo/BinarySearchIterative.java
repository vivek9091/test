package com.vivek.practise.ds.searchAlgo;

public class BinarySearchIterative {

	public boolean binarySearch(int[] array, int data, int lowIndex, int highIndex){
		int mid ;
		while (lowIndex <= highIndex){
			mid = (lowIndex + highIndex )/2;
			if(array[mid] == data){
				return true;
			}
			else if (data < array[mid]){
				highIndex = mid-1;
			}
			else {
				lowIndex = mid+1;
			}
			
		}
		return false;
	}

}
