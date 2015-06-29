package com.OCP22;

import java.util.Observable;
import java.util.Observer;
public class ShapeArchiver implements Observer{
	public void update(Observable arg0, Object arg1){
		System.out.println("ShapeArchiver :: Update");
	}
}
