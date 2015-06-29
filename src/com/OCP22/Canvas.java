package com.OCP22;

import java.util.Observable;
import java.util.Observer;

public class Canvas implements Observer {
	public void update(Observable argo0, Object arg1){
		System.out.println("Canvas :: Update");
	}
}
