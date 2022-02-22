//Overloading Constructors
package Chapter4.Constructor;

public class Hamster {
	private String color;
	private int weight;

//	public Hamster(int weight) { // first constructor
//		this.weight = weight;
//		color = "brown";
//	}

	public Hamster(int weight) {
		//System.out.println("in constructor");
		// ready to call this
		this(weight, "brown"); // DOES NOT COMPILE
	}

	public Hamster(int weight, String color) { // second constructor
		this.weight = weight;
		this.color = color;
	}

}