package com.vivek.practise;

import java.util.List;
import java.util.ArrayList;

public class ProducerConsumerWithWaitAndNotify {

	public static void main(String[] args) {
		List<Integer> taskQueue = new ArrayList<Integer>();
		int MAX_CAPACITY=5;
		new Thread (new Producer(taskQueue, MAX_CAPACITY),"ProducerThread").start();
		new Thread (new Consumer(taskQueue),"ConsumerThread").start();

	}

}
