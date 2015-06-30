package com.OCP29;

public interface CircleDAO {
	public void insertCircle(CircleTransfer circle);
	public CircleTransfer findCircle(int id);
	public void deleteCircle(int id);
}
