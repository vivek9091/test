package com.vivek.practise;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	List<Integer> taskQueue = new ArrayList<Integer>();
	int MAX_CAPACITY;
	
	public Producer(List<Integer> taskQueue, int mAX_CAPACITY) {
		super();
		this.taskQueue = taskQueue;
		MAX_CAPACITY = mAX_CAPACITY;
	}



	@Override
	public void run() {
		int counter=0;
		while(true){
			try {
				produce(counter++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void produce(int i) throws InterruptedException {
		synchronized(taskQueue){
			if(taskQueue.size() == MAX_CAPACITY){
				System.out.println("Queue Capacity is Full.");
				taskQueue.wait();
			}
			Thread.sleep(2000);
			taskQueue.add(i);
			System.out.println("Produced "+i);
			taskQueue.notifyAll();
		}
		
	}

}
