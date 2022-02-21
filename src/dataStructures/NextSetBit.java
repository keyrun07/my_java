package dataStructures;
import java.util.*;
public class NextSetBit {

	public static void main(String[] args) {
		// Constructors of BitSet class
		BitSet bs1 = new BitSet();
		BitSet bs2 = new BitSet();
		BitSet bs3 = new BitSet();

		/* assigning values to set1 */
		bs1.set(6);
		bs1.set(1);
		bs1.set(5);
		bs1.set(4);

		// assign values to bs2
		bs2.set(4);
		bs2.set(6);
		bs2.set(5);
		bs2.set(1);
		bs2.set(8);
		bs2.set(3);
		bs2.set(12);

		// Printing the 2 Bitsets
		System.out.println("bs1 : " + bs1);
		System.out.println("bs2 : " + bs2);
		System.out.println("bs3 : " + bs3);

		// Performing nextSetBit() on bitsets
		System.out.println(bs1.nextSetBit(2));
		System.out.println(bs2.nextSetBit(2));
		System.out.println(bs3.nextSetBit(3));
		
		System.out.println("bs1 : " + bs1);
		System.out.println("bs2 : " + bs2);
		System.out.println("bs3 : " + bs3);
	}
}