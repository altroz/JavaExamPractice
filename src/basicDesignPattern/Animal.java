package basicDesignPattern;

public class Animal {
	private String name;
	private double height;
	private int weight;
	private String sound;

	public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}

	public void setWeight(int newWeight) {
		weight = newWeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setHeight(double newHeight) {
		height = newHeight;
	}

	public double getHeight() {
		return height;
	}

	public void setSound(String newSound) {
		sound = newSound;
	}

	public String getSound() {
		return sound;
	}
}
