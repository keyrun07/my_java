package dataStructures;

import java.util.*;
public class BitSet3 {
public static void main(String[] args)
    {
        // creating two bitsets
        BitSet bset = new BitSet(9);
  
        // assigning value using set(fromnum, tonum)
        // adds 3 to 8
        bset.set(3, 9);
  
        // printing the bitset
        System.out.println("The constructed bitset is : " + bset);
    }
}