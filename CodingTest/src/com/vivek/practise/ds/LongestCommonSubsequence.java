package com.vivek.practise.ds;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String a="ABCBDAB"; String b="ABCBDAB";
		int length = LCSLength(a,b,a.length(),b.length());
		System.out.println(length);
	}

	private static int LCSLength(String a, String b, int m, int n) {
		//base case
		if(m == 0 || n == 0)
			return 0;
		else if (a.charAt(m-1) == b.charAt(n-1)){
			return 1 + LCSLength (a,b,m-1,n-1);
		}
		else
			return Math.max(LCSLength(a,b,m,n-1), LCSLength(a,b,m-1,n));

	}

}
