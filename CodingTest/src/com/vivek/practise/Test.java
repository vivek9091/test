package com.vivek.practise;
public class Test {

	public static void main(String[] args) {
		new Test().display(null);
		String s = "Hello  ";
		s+= "Adobe  ";
		s.trim(); 
		System.out.print(s);
		
		  StringBuffer sb1 = new StringBuffer("Amit");
		  StringBuffer sb2 = new StringBuffer("Amit");
		  String ss1 = "Amit";
		  System.out.println(sb1==sb2);
		  System.out.println(sb1.toString().equals(sb2.toString()));
		  System.out.println(sb1.equals(ss1));
		  System.out.println("Poddar".substring(3));
	}
	void display(Test t){
	System.out.println(t);
		try{
			//throw new ClassNotFoundException();
		}catch(Exception e){
			throw new NullPointerException();
		}
	}
	/*void display(String t){
		System.out.println("String");
	}*/
}
