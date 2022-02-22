package Chapter3;
import java.util.*;
public class ArrayHigher {
	public static void main(String args[]) {
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 5;
		System.out.println(numbers[8]);
		System.out.println(numbers.toString());
		

		
		//This means that all four of these statements do the exact same thing:
			int[] numAnimals; 
			int [] numAnimals2; 
			int numAnimals3[]; 
			int numAnimals4 [];
			
			String s1[];
			String s2[];
			String s3[]= {"one", "two"};
			s1 = new String[2];
			
			s1[0] = "one";
			s1[1] = "two";
			
			
			System.out.println(s1.toString());
			System.out.println(s1[1]);
			System.out.println(s3.toString());
			System.out.println(Arrays.toString(s3));
			//numAnimals[] = [2];
			
		
	}
}