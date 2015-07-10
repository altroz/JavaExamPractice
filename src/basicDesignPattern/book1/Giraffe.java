package basicDesignPattern.book1;

public class Giraffe extends Creature {
	private String name;
	private double weight;

	@Override
	public void setName(String newName) {
		// TODO Auto-generated method stub
		name = newName;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setWeight(double newWeight) {
		// TODO Auto-generated method stub
		weight = newWeight;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

}
