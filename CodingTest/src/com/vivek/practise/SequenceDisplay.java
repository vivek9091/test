package com.vivek.practise;

public class SequenceDisplay {
	
	static boolean one=true;
	static boolean two=false;
	static boolean three=false;
	

	public static void main(String[] args) {
		//Thread t1= new SequenceDisplayImpl (1);
	new Thread (new SequenceDisplayImpl (1),"thread1").start();	
	new Thread (new SequenceDisplayImpl (2),"thread2").start();	
	new Thread (new SequenceDisplayImpl (3),"thread3").start();	

	}


 static class SequenceDisplayImpl implements Runnable{
	int threadId;

	public SequenceDisplayImpl(int threadId) {
		this.threadId = threadId;
	}



	@Override
	public void run() {
		print();		
	}



	private void print() {
		try {
		while(true){
			Thread.sleep(500);
			synchronized(this){
				if(1 == threadId){
					if(!one){
						this.wait();
					}
					else{
						System.out.println(Thread.currentThread().getName() +"-" +threadId);
						one=false;
						two=true;
						three=false;
						this.notifyAll();
					}
				}
				if(2 == threadId){
					if(!two){
						this.wait();
					}
					else{
						System.out.println(Thread.currentThread().getName() +"-" +threadId);
						one=false;
						two=false;
						three=true;
						this.notifyAll();
					}
				}
				if(3 == threadId){
					if(!three){
						this.wait();
					}
					else{
						System.out.println(Thread.currentThread().getName() +"-" +threadId);
						one=true;
						two=false;
						three=false;
						this.notifyAll();
					}
				}
			}
			
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

}