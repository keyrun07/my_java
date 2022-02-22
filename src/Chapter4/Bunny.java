package Chapter4;

public class Bunny {
	private String color;
	private int height;
	private int length;

	public Bunny(int length1, int theHeight) {
		length = length1; // backwards – no good!
		height = theHeight; // fine because a different name
		color = "white"; // fine, but redundant
	}

	public static void main(String[] args) {
		Bunny b = new Bunny(1, 2);
		System.out.println(b.length + " " + b.height + " " + b.color);
	}
}