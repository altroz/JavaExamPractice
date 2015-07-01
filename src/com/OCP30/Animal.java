package com.OCP30;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;

	public void setName(String newName) {
		name = newName;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}

	public void setWeight(int newWeight) {
		if (newWeight > 0)
			weight = newWeight;
		else
			System.out.println("Weight must be bigger than 0");
	}

	public int getWeight() {
		return weight;
	}

	public void setSound(String newSound) {
		sound = newSound;
	}

	public String getSound() {
		return sound;
	}
}
