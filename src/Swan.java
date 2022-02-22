public class Swan {
	static int  numberEggs;// instance variable

	public static void main(String[] args) {
		float f1 =125.5f;
		int string = 5;
		Swan mother = new Swan();
		mother.numberEggs = 1; // set variable
		numberEggs =5;
		System.out.println(mother.numberEggs); // read variable
		System.out.println(numberEggs);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(f1);
		 int y = 10;
		 int x;
		// int reply = x + y; // DOES NOT COMPILE
		// return reply;
		 
		System.out.println( mother.myFun("mom"));
		System.out.println(myFun("parent"));
		 
		 
	}
	public String myFun(String text) {
		return "hi my Fun from myFun" + text;
	}
}

