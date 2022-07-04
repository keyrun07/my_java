package programIZ;

public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		nanoTime();
		// 120 done
	}

	private static void nanoTime() {
		// TODO Auto-generated method stub
		// create an object of the Main class
		Test100 obj = new Test100();

		// get the start time
		long start = System.nanoTime();

		// call the method
		obj.display();

		// get the end time
		long end = System.nanoTime();

		// execution time
		long execution = end - start;
		System.out.println("Execution time: " + execution + " nanoseconds");

	}

	public void display() {
		System.out.println("Calculating Method execution time:");
	}

}
