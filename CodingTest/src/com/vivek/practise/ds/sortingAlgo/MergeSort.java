package com.vivek.practise.ds.sortingAlgo;

public class MergeSort {

	public void recursiveMergeSort(int array[], int helper[],int low,int high){
		if(low < high){
			int middle = (low +high )/2;
			recursiveMergeSort(array,helper,low,middle);
			recursiveMergeSort(array,helper,middle+1,high);
			merge(array,helper,low,middle,high);
		}
	}

	private void merge(int[] array, int[] helper, int low, int middle, int high) {
		//copy left and right halves into a helper array
		for(int i=low; i <= high; i++){
			helper[i] = array[i];
		}
		int helperLeft= low;
		int current=low;
		int helperRight=middle+1;
		/*iterate through the helper array. compare left and right half, 
		 * copying back the smaller element from the two halves into the original array.*/
		while(helperLeft <= middle && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		int remaining = middle - helperLeft;
		for(int i=0 ; i<= remaining ; i++){
			array[current + i] = helper [helperLeft + i];
		}
	}
}
