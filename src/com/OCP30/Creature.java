package com.OCP30;

public abstract class Creature {
	protected String name;
	protected int weight;
	protected String sound;

	public abstract void setName(String newName);

	public abstract String getName();

	public abstract void setWeight(double newWeight);

	public abstract double getWeight();
}
