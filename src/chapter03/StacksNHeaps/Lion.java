package chapter03.StacksNHeaps;

public class Lion {
	Maine m; // Instance Object Reference Variable
	static String name; //Instance String Object Reference Variable
	
	public static void main(String[] args){
		Lion d; //Local variable pertaining to the method. 
		d=new Lion();
		d.go(d);
	}
	
	void go(Lion lion){ //local variable
		Maine c = new Maine();
		Lion.setName("Aiko");
	}
	static void setName(String LionName){
		name = LionName;
	}
}
