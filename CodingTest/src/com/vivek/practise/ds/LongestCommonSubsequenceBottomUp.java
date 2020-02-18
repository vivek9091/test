package com.vivek.practise.ds;

public class LongestCommonSubsequenceBottomUp {

	public static void main(String[] args) {
		String a="ABCBDAB"; String b="ABCBDAB";
		int length = LCSLength(a,b,a.length(),b.length());
		System.out.println(length);
	}

	private static int LCSLength(String a, String b, int m, int n) {
		//base case
		int [][]lcs = new int[m+1][n+1];
		for(int i=0 ; i<= m; i++){
			for(int j=0; j<=n ;j++){
				if(i == 0 || j == 0)
					lcs[i][j]= 0;
				else if (a.charAt(m-1) == b.charAt(n-1)){
					lcs[i][j]= 1 + lcs[i-1][j-1];
				}
				else
					lcs[i][j]= Math.max(lcs[i][j-1], lcs[i-1][j]);	
			}
		}

		return lcs[m][n];
	}

}
