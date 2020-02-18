package com.vivek.practise.ds.searchAlgo;

public class BinarySearchRecursive {

	public boolean binarySearch(int[] array, int data, int lowIndex, int highIndex){
		if(lowIndex <= highIndex) {
		int mid = (lowIndex + highIndex )/2;
			if(array[mid] == data){
				return true;
			}
			else if (data < array[mid]){
				return binarySearch(array,data,lowIndex, mid-1 );
			}
			else {
				return binarySearch(array,data,mid+1, highIndex );
			}
		}
		return false;
	}
	
}
