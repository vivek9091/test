package com.vivek.practise.ds;

public class FibonacciBottomUpApproach {
	static int fibo[];
	public static void main(String[] args) {
		int n=9;fibo= new int[n+1];
		int x = fibonacci(n);
		System.out.println(x);
		for(int j : fibo){
			System.out.print(j + " ");
		}

	}

	private static int fibonacci(int n) {
		//fibo[0]=0;fibo[1]=1;
		if(n == 1) return 0;
		if(n == 2) return 1;
		if(fibo[n] != 0 )return fibo[n];
		return fibo[n] = fibonacci (n-1) + fibonacci (n-2);
	}

}
