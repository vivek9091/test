package com.vivek.practise;

import java.util.ArrayList;
import java.util.List;

public class Consumer implements Runnable {
	List<Integer> taskQueue = new ArrayList<Integer>();
	

	public Consumer(List<Integer> taskQueue) {
		super();
		this.taskQueue = taskQueue;
	}


	@Override
	public void run() {
		while(true){
			try {
				consume();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


	private void consume() throws InterruptedException {
		synchronized(taskQueue){
			if(taskQueue.size()==0){
				System.out.println("Queue is Empty.");
				taskQueue.wait();
			}
			Thread.sleep(1000);
			int i = taskQueue.remove(0);
			System.out.println("Consumed"+ i);
			taskQueue.notifyAll();
		}
		
	}

}
