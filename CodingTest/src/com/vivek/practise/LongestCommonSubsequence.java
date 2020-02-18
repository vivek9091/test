package com.vivek.practise;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String m="ABCDGH"; String n= "CH"; String o="ACZH";
		int x= LCS(m,n,o,m.length(),n.length(),o.length());
		System.out.println(m.length() + " "+m.toCharArray().length );
		System.out.println(x);

	}

	private static int LCS(String m, String n, String o, int x,int y, int z) {
		//base case 
		if (x == 0 || y == 0 || z == 0 ) return 0;
		
		if(m.charAt(x-1) == n.charAt(y-1)&& n.charAt(y-1) == o.charAt(z-1))
			return LCS(m,n,o,x-1,y-1,z-1) + 1;
		else
			return Integer.max(Integer.max(LCS(m,n,o,x,y-1,z), LCS(m,n,o,x,y,z-1)), LCS(m,n,o,x-1,y,z));
	}

}
