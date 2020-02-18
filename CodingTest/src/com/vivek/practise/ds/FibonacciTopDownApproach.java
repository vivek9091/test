package com.vivek.practise.ds;

public class FibonacciTopDownApproach {
	public static void main(String[] args) {
		int n=3;
		int x = fibonacci(n);
		System.out.println(x);
	}

	private static int fibonacci(int n) {
		int []fib = new int[n];
		fib[0]=0;
		fib[1]=1;
		for(int i=2; i < n; i++)
			fib[i]= fib[i-1] + fib[i-2];
		for(int j:fib)
			System.out.print(j + " ");
		System.out.println();
		return fib[n-1];
	}

}
