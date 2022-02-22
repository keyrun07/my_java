package Chapter3;

public class StringCasting {
	public static void main(String args[]) {
		
		int numFish = 4;
		String fishType ="Tuna";
		String anotherFish = String.valueOf(numFish +1);
		String anotherFish2 = numFish + 1 + fishType;

		String[] strings = { "stringValue" };
		Object[] objects = strings;
		String[] againStrings = (String[]) objects;
		//againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
		//objects[0] = new StringBuilder(); // careful!
		
		//StringBuilder[] alpha = new StringBuilder[];
		//alpha[0]= new String("a");
		
		char[]c = new char[2];
		String s = new String("ss");
		int i = 5;
		// INSERT CODE HERE
		//int length = c.capacity;
		//int length = c.capacity();
		//int length = c.length;
		//int length = c.length();
		//s = i.clone();
		s.length();
	
		//int length = c.clone();
		//int length = c.size();

	}
}