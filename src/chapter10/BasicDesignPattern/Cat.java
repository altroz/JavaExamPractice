package chapter10.BasicDesignPattern;

/*@Explanation
 * The following class called Cat extends to Animal SuperClass. 
 * Cat is a subclass of Animal. The Cat class contains a constructor
 * for initiating a characteristic of Animal called setSound. With
 * a call to super(), the superclass is called and the Cat invokes 
 * the setSound method with an arguement. 
 * 
 * */

public class Cat extends Animal{
	public Cat(){
		super();
		setSound("MEEEEEOOOOOWWWWWW");
	}
}
