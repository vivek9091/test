package com.vivek.practise;

import java.util.Random;

public class RotateArrayClockwise {

	public static void main(String[] args) {
		int size=7;
		int array[][]= new int[size][size];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				array[i][j] = new Random().nextInt(100);
			}
		}
		printArray(array);
		int[][] rotatedArray= rotate(array);
		System.out.println("After Rotation");
		printArray(rotatedArray);
	}

	private static void printArray(int[][] array) {
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				System.out.print (array[i][j]+ "	");
			}
			System.out.println();
		}
	}

	private static int[][] rotate(int[][] array) {
		int length=array.length;
		for(int i=0 ; i< array.length/2;i++){
			for(int j=i;j<array.length-i-1 ;j++){
				int temp = array[i][j];
				array[i][j]=array[length-j-1][i];
				array[length-j-1][i]=array[length-i-1][length-j-1];
				array[length-i-1][length-j-1]=array[j][length-i-1];
				array[j][length-i-1] =temp;
			}
		}
		return array;
	}
}
