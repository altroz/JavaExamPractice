package dataObjectAccessDesignPattern;

import java.io.Serializable;

public class CircleTransfer implements Serializable {
	private int xPos;
	private int yPos;
	private int radius;

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getxPos() {
		return xPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}
}
