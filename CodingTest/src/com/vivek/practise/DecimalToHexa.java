package com.vivek.practise;

public class DecimalToHexa {

	public static void main(String[] args) {
		int decimalValue = 198;
		printDecimalToHexa(decimalValue);

	}
	private static void printDecimalToHexa(int decimalValue) {
		int temp= decimalValue;
		StringBuilder output = new StringBuilder();
		while (temp > 0){
			int n = temp % 16;
			if(n == 10){
				output.append("A");
			}
			if(n == 11){
				output.append("B");
			}
			if(n == 12){
				output.append("C");
			}
			if(n == 13){
				output.append("D");
			}
			if(n == 14){
				output.append("E");
			}
			if(n == 15){
				output.append("F");
			}
			if (n >=  0 && n < 10)
				output.append(n);
			temp=temp/16;
		}
		System.out.println(output.reverse());
	}

}
