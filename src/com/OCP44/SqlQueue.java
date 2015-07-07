package com.OCP44;

import java.util.*;

public class SqlQueue {
	private Deque <String>sqlQ = new ArrayDeque<>();
	
	void addInQueue(String customer){
		sqlQ.addLast(customer);
	}
	void removeFront(){
		sqlQ.removeFirst();
	}
	
	void removeBack(){
		sqlQ.removeLast();
	}
	void printQueue(){
		System.out.println("Special queue contains: "+ sqlQ);
	}
}
