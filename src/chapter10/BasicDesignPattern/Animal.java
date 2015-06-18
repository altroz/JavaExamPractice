package chapter10.BasicDesignPattern;

/*@ Explanation
 * The Animal class is a superClass. It contains the basic and general
 * informations (instance variable + methods) that defines the 'characteristics'
 * of a typical animal. In this case it particular pertains to our typical animal. 
 * */

public class Animal {
	private String name;
	//private double height;
	private int weight;
	private String sound;
	
	//Implementing Getter and Setters Methods
	public void setName(String newName){name = newName;}
	public String getName(){return name;}
	
	public void setWeight(int newWeight){weight = newWeight;}
	public int getWeight(){return weight;}
	
	public void setSound(String newSound){sound = newSound;}
	public String getSound(){return sound;}
}
