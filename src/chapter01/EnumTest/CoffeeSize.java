package chapter01.EnumTest;

public enum CoffeeSize {
	TALL(12), 
	GRANDE(16), 
	VENTI(20);
	
	CoffeeSize(int ounces){
		this.ounces = ounces;
	}
	
	private int ounces;
	public int getOunces(){
		return ounces;
	}
}
