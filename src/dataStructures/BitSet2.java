package dataStructures;

import java.util.*;
public class BitSet2 {
public static void main(String[] args)
    {
        // creating two bitsets
        BitSet bset = new BitSet(5);
  
        // assigning value using set(num, value)
        // adds 3
        bset.set(3, true);
  
        // doesn't add 5
        bset.set(5, false);
        bset.set(7, true);
        bset.set(4, true);
  
        // printing the bitset
        System.out.println("The constructed bitset is : " + bset);
    }
}