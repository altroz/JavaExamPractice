package com.OCP44;

public class SqlQueueTest {
	public static void main(String[]args){
		SqlQueue sqlQ = new SqlQueue();
		sqlQ.addInQueue("Harrison");
		sqlQ.addInQueue("Jacequline");
		sqlQ.addInQueue("Mathew");
		sqlQ.addInQueue("Carrie");
		
		sqlQ.printQueue();
		sqlQ.removeFront();
		sqlQ.removeBack();
		sqlQ.printQueue();
	}

	
}
