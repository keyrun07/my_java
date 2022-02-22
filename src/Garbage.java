
public class Garbage {

	protected void finalize() {
		System.out.println("destroyed!");
		}
	public static void main(String[] args) {
		Garbage g = new Garbage();
		g = null;
		System.gc();

	}

}
