package Chapter4;

public class Mouse {
	private int numTeeth;
	private int numWhiskers;
	private int weight;

	public Mouse(int weight1) {		
		this(weight1, 16); // calls constructor with 2 parameters
		//weight = weight1;
	}

	public Mouse(int weight1, int numTeeth) {
		this(weight1, numTeeth, 6); // calls constructor with 3 parameters
	}

	public Mouse(int weight1, int numTeeth1, int numWhiskers1) {
		this.weight = weight1;
		this.numTeeth = numTeeth1;
		this.numWhiskers = numWhiskers1;
	}

	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}

	public static void main(String[] args) {
		Mouse mouse = new Mouse(15);
		mouse.print();
	}
}
