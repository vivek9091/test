package com.vivek.practise;

import java.util.concurrent.Semaphore;

public class PrintSeriesByNThreads {

	public static void main(String[] args) {
		Semaphore one= new Semaphore(1);
		Semaphore two= new Semaphore(0);
		Semaphore three= new Semaphore(0);
		PrintOneNumber printOneNumber = new PrintOneNumber(one,two);
		PrintTwoNumber printTwoNumber = new PrintTwoNumber (two,three);
		PrintThreeNumber printThreeNumber = new PrintThreeNumber (three,one);
		
		new Thread (printOneNumber, "Thread1").start();
		new Thread (printTwoNumber, "Thread2").start();
		new Thread (printThreeNumber, "Thread3").start();

	}

}

class PrintOneNumber implements Runnable {
	Semaphore semaphoreOne;
	Semaphore semaphoreTwo;
	String name=Thread.currentThread().getName();
	
	public PrintOneNumber(Semaphore semaphoreOne, Semaphore semaphoreTwo) {
		this.semaphoreOne = semaphoreOne;
		this.semaphoreTwo = semaphoreTwo;
	}



	@Override
	public void run() {
		
		for(int i=1 ; i<= 90; i+=3){
			try{
				semaphoreOne.acquire();
				if(i == 1)
					System.out.print(Thread.currentThread().getName() +" - ");
				System.out.print(i + "  ");
				semaphoreTwo.release();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}


class PrintTwoNumber implements Runnable {
	Semaphore semaphoreTwo;
	Semaphore semaphoreThree;
	String name=Thread.currentThread().getName();
	
		public PrintTwoNumber(Semaphore semaphoreTwo, Semaphore semaphoreThree) {
		super();
		this.semaphoreTwo = semaphoreTwo;
		this.semaphoreThree = semaphoreThree;
		//this.name = name;
	}




	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName() +" - ");
		for(int i=2 ; i<= 90; i+=3){
			try{
				semaphoreTwo.acquire();
				if(i == 2){
					System.out.println();
					System.out.print(Thread.currentThread().getName() +" - ");
				}
					
				System.out.print(i + "  ");
				semaphoreThree.release();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
}


class PrintThreeNumber implements Runnable {
	Semaphore semaphoreThree;
	Semaphore semaphoreOne;
	String name=Thread.currentThread().getName();
	

	public PrintThreeNumber(Semaphore semaphoreThree, Semaphore semaphoreOne) {
		this.semaphoreThree = semaphoreThree;
		this.semaphoreOne = semaphoreOne;
		//this.name = name;
	}






	@Override
	public void run() {
		//System.out.println(Thread.currentThread().getName() +" - ");
		for(int i=3 ; i<= 90; i+=3){
			try{
				semaphoreThree.acquire();
				if(i == 3){
					System.out.println();
					System.out.print(Thread.currentThread().getName() +" - ");
				}
					
				System.out.print(i + "  ");
				System.out.print('\r');
				semaphoreOne.release();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	
}