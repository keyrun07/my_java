package programIZ;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public Test1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//displayAlphabets();
		//digitsCount21a();
		//digitsCount21b();
		//reverseNumber();
		//powerNumber();
		//palindromeNumber();
		//isPrimeNumber();
		//primeNumbersBetweenTwo();
		//isArmstrongNumber();
		//getArmstrongNumberBetween(999, 99999);
		//multiplyNumbers();
		//GCDofTwoNumbers();
		//binaryToDecimal_1();
		//binaryToDecimal_2();
		//octalToDecimal();
		//convertBinaryToOctal_1();
		//convertBinaryToOctal_2();
		//reverseSentence();
		// powerRecursion41();
		// addTwoMatrix45();
		// transposeMatrix49();
		// sortStrings51();
		// charArrayToString();
		// stringToCharArray();
		// JoinLists66();
		// ListToArray();
		// currentDirectory();
		// sortArrayList();
		// CheckIStringNumeric();
		// longToInt();
		// booleanToString();
		// stringToBoolean();
		WrapperObjectsToPrimitiveTypes();
		
	}
	
	private static void WrapperObjectsToPrimitiveTypes() {
		// TODO Auto-generated method stub
		// creates objects of wrapper class
		Integer obj1 = Integer.valueOf(23);
		Double obj2 = Double.valueOf(5.55);
		Boolean obj3 = Boolean.valueOf(true);

		// converts into primitive types
		int var1 = obj1.intValue();
		double var2 = obj2.doubleValue();
		boolean var3 = obj3.booleanValue();

		// print the primitive values
		System.out.println("The value of int variable: " + var1);
		System.out.println("The value of double variable: " + var2);
		System.out.println("The value of boolean variable: " + var3);

	}

	private static void stringToBoolean() {
		// TODO Auto-generated method stub
		// create string variables
		String str1 = "true";
		String str2 = "false";

		// convert string to boolean
		// using valueOf()
		boolean b1 = Boolean.valueOf(str1);
		boolean b2 = Boolean.valueOf(str2);

		// convert string to boolean
		// using parseBoolean()
		// boolean b1 = Boolean.parseBoolean(str1);
		// boolean b2 = Boolean.parseBoolean(str2);

		// print boolean values
		System.out.println(b1); // true
		System.out.println(b2); // false
	}

	private static void booleanToString() {
		// TODO Auto-generated method stub
		// create boolean variables
		boolean booleanValue1 = true;
		boolean booleanValue2 = false;

		// convert boolean to string
		// using valueOf()
		String stringValue1 = String.valueOf(booleanValue1);
		String stringValue2 = String.valueOf(booleanValue2);

		System.out.println(stringValue1); // true
		System.out.println(stringValue2); // true
	}

	private static void longToInt() {
		// TODO Auto-generated method stub
		// create long variables
		long a = 2322334444441L;
		long b = 52341241L;
		int aa = 5;

		// convert long into int
		// using typecasting
		int c = (int) a;
		int d = (int) b;

		long cc = aa;

		System.out.println(c); // 2322331
		System.out.println(d); // 52341241
		System.out.println(cc); // 52341241

	}

	private static void CheckIStringNumeric() {
		// TODO Auto-generated method stub

		String string = "12345.15a";
		boolean numeric = true;

		try {
			Double num = Double.parseDouble(string);
		} catch (NumberFormatException e) {
			numeric = false;
		}

		if (numeric)
			System.out.println(string + " is a number");
		else
			System.out.println(string + " is not a number");

	}

	private static void sortArrayList() {
		// TODO Auto-generated method stub

	}

	private static void currentDirectory() {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		System.out.println("Working Directory = " + path);

		String path2 = Paths.get("").toAbsolutePath().toString();
		System.out.println("Working Directory = " + path2);

	}

	private static void ListToArray() {
		// TODO Auto-generated method stub
		ArrayList languages = new ArrayList<>();

		// Add elements in the list
		languages.add("Java");
		languages.add("Python");
		languages.add("JavaScript");
		System.out.println("ArrayList: " + languages);

		// Create a new array of String type
		// String[] arr = new String[languages.size()];

		// Convert ArrayList into the string array
		String[] arr = (String[]) languages.toArray();
		System.out.print("Array: ");
		for (String item : arr) {
			System.out.print(item + ", ");
		}
	}

	private static void JoinLists66() {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("a");

		List<String> list2 = new ArrayList<String>();
		list2.add("b");
		list2.add("c");

		List<String> joined = new ArrayList<String>();

		joined.addAll(list1);
		joined.addAll(list2);

		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println("joined: " + joined);
	}

	private static void stringToCharArray() {
		// TODO Auto-generated method stub
		String st = "This is great";

		char[] chars = st.toCharArray();
		System.out.println(Arrays.toString(chars));

	}

	private static void charArrayToString() {
		// TODO Auto-generated method stub
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };

		String st = String.valueOf(ch);
		String st2 = new String(ch);

		System.out.println(st);
		System.out.println(st2);

	}

	private static void sortStrings51() {
		// TODO Auto-generated method stub
		String[] words = { "Ruby", "C", "Python", "Java" };

		for (int i = 0; i < 3; ++i) {
			for (int j = i + 1; j < 4; ++j) {

				if (words[i].compareTo(words[j]) > 0) {

					// swap words[i] with words[j[
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}

		System.out.println("In lexicographical order:");

		for (int i = 0; i < 4; i++) {
			System.out.println(words[i]);
		}

	}

	private static void transposeMatrix49() {
		// TODO Auto-generated method stub
		 int row = 2, column = 3;
	        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

	        // Display current matrix
	        displayMatrix(matrix);

	        // Transpose the matrix
	        int[][] transpose = new int[column][row];
	        for(int i = 0; i < row; i++) {
	            for (int j = 0; j < column; j++) {
	                transpose[j][i] = matrix[i][j];
	            }
	        }

	        // Display transposed matrix
			displayMatrix(transpose);
	}

	public static void displayMatrix(int[][] matrix) {
		System.out.println("The matrix is: ");
		for (int[] row : matrix) {
			for (int column : row) {
				System.out.print(column + "    ");
			}
			System.out.println();
		}
	}

	private static void addTwoMatrix45() {
		// TODO Auto-generated method stub
		int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
	}

	private static void powerRecursion41() {
		// TODO Auto-generated method stub
		int base = 3, powerRaised = 4;
	    int result = powerRecursion(base, powerRaised);

	    System.out.println(base + "^" + powerRaised + "=" + result);
		
	}
	
	public static int powerRecursion(int base, int powerRaised) {
	    if (powerRaised == 0) {
	    	return 1;
	    }

	      // recursive call to power()
	     int i = ( base * powerRecursion(base, powerRaised - 1));
	    
	     System.out.println("i: " + i);
	     return i;
	  }

	private static void reverseSentence() {
		// TODO Auto-generated method stub
		
		  String sentence = "Go work";
		    String reversed = reverseSentence(sentence);
		    System.out.println("The reversed sentence is: " + reversed);
		  }

	  public static String reverseSentence(String sentence) {
		  String rS ="";
		  if(rS != null) {
		    	System.out.println("rS: " +rS);
		    }
	    if (sentence.isEmpty()) {
	    	System.out.println("it is empty now. "+ sentence);
	      return sentence;
	    }
	    System.out.println("Before - sentence: "+ sentence);
	    
	     rS =  reverseSentence(sentence.substring(1)) + sentence.charAt(0);
	    System.out.println("After - sentence: "+ sentence);
	    System.out.println("rS: " +rS);
	    
	    return rS;
	  }
	private static void convertBinaryToOctal_2() {
		// TODO Auto-generated method stub		
	    String binary = "1001";	    
	    // convert to decimal
	    int decimal = Integer.parseInt(binary, 2);
	    String octal = Integer.toOctalString(decimal); 
	    System.out.println(binary + " in binary = " + decimal + " in decimal = "+ octal + " in octal" );
	}

	private static void convertBinaryToOctal_1() {
		// TODO Auto-generated method stub
		
	    long binaryNumber = 1001;
	    long binaryNumber1 = binaryNumber;
	    int octalNumber = 0;
	    int decimalNumber = 0;
	    int decimalNumber1 = 0;
	    int i = 0;

	    while (binaryNumber != 0) {
	      decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
	      ++i;
	      binaryNumber /= 10;
	    }
	    
	    decimalNumber =88;
	    decimalNumber1 = decimalNumber;
	    i = 1;

	    while (decimalNumber != 0) {
	      octalNumber += (decimalNumber % 8) * i;
	      i *= 10;
	      decimalNumber /= 8;
	      //System.out.println("octalNumber : "+octalNumber);
	      //System.out.println("decimalNumber : "+decimalNumber);
	    }	    
	    System.out.println(binaryNumber1 + " in binary = " + decimalNumber1 + " in decimal = " +  octalNumber + " in octal");
	}

	private static void octalToDecimal() {

	    long num = 1000;
	    long num1 = num;
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;

	      decimalNumber += remainder * Math.pow(8, i);
	      ++i;
	    }
	    
	    System.out.println("Octal to Decimal");
	    System.out.println(num1 + " = " + decimalNumber);
	    
		
	}
	private static void binaryToDecimal_2() {
		// TODO Auto-generated method stub
	    // binary number
		//System.out.println(Math.pow(4, 3));
	    long num = 1000;
	    long num1 = num;
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;

	      decimalNumber += remainder * Math.pow(2, i);
	      
//	      System.out.println("remainder: "+ remainder );
//	      System.out.println("power : "+ Math.pow(2, i));
//	      System.out.println("decimalNumber : "+ decimalNumber);
	      
	      ++i;
	    }
	    
	    System.out.println("Binary to Decimal");
	    System.out.println(num1 + " = " + decimalNumber);
	    
		
	}

	private static void binaryToDecimal_1() {
		// TODO Auto-generated method stub
	    // binary number
	    String binary = "01011011";
	    
	    // convert to decimal
	    int decimal = Integer.parseInt(binary, 2);
	    System.out.println(binary + " in binary = " + decimal + " in decimal.");
		
	}

	private static void GCDofTwoNumbers() {
		// TODO Auto-generated method stub
        //int n1 = 366, n2 = 60;
		//int n1 = 255, n2 = 50;
		int n1 = 12, n2 = 6;
        int hcf = hcf(n1, n2);

        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }

	public static void multiplyNumbers() {
		int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        System.out.println(Integer.MAX_VALUE);
		
	}
	public static long multiplyNumbers(int a)
    {
		long l;
        if (a !=1) {
        	//System.out.println("before: " + a);
            l = a * multiplyNumbers(a - 1);
        	//System.out.println("after: " + a);
        	//System.out.println("factorial l: " + l);
        	return l;
        }else {
            return 1;
        }
    }
	
	private static void getArmstrongNumberBetween(int a, int b) {
		// TODO Auto-generated method stub
		
	    int low = 999, high = 99999;

	    for(int number = low + 1; number < high; ++number) {
	      int digits = 0;
	      int result = 0;
	      int originalNumber = number;

	      // number of digits calculation
	      while (originalNumber != 0) {
	        originalNumber /= 10;
	        ++digits;
	      }

	      originalNumber = number;

	      // result contains sum of nth power of its digits
	      while (originalNumber != 0) {
	        int remainder = originalNumber % 10;
	        result += Math.pow(remainder, digits);
	        originalNumber /= 10;
	      }

	      if (result == number) {
	        System.out.print(number + " ");
	      }
	    }

	
		for(int i=a+1; i<b; i++) {
			if(isArmstrongNumber(i)) {
				System.out.println(i);
			}
		}
		
	}

	private static void isArmstrongNumber( ) {		
		int number =1634;
		//1634 8208 9474 54748 92727 93084 
        if(isArmstrongNumber(number))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
		
	}
	
	private static boolean isArmstrongNumber(int number ) {		
        int  originalNumber, remainder, result = 0, digits=0;

        originalNumber = number;
        // number of digits calculation
        while (originalNumber != 0) {
          originalNumber /= 10;
          ++digits;
        }

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, digits);
            originalNumber /= 10;
        }

        if(result == number)
            return true;
        else
            return false;
	}

	private static void primeNumbersBetweenTwo() {
		// TODO Auto-generated method stub
        int low = 2, high = 50;

        while (low < high) {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i) {
                // condition for nonprime number
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag && low != 0 && low != 1)
                System.out.print(low + " ");

            ++low;
        }
		
	}

	private static void isPrimeNumber() {
		// TODO Auto-generated method stub
	    int num = 29;
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
		
	}

	private static void palindromeNumber() {
		// TODO Auto-generated method stub
	    int num = 35531, reversedNum = 0, remainder;
	    
	    // store the number to originalNum
	    int originalNum = num;
	    
	    // get the reverse of originalNum
	    // store it in variable
	    while (num != 0) {
	      remainder = num % 10;
	      //System.out.println("remainder: "+remainder);
	      reversedNum = reversedNum * 10 + remainder;
	      //System.out.println("reversedNum: "+reversedNum);
	      num /= 10;
	      //System.out.println("num: "+num);
	    }
	    
	    // check if reversedNum and originalNum are equal
	    if (originalNum == reversedNum) {
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
		
	}

	private static void powerNumber() {
		// TODO Auto-generated method stub
		
		
		
	    int base = 3, exponent = 4;
	    long result = 1;
	  //Solution 1
//	    while (exponent != 0) {
//	      result *= base;
//	      --exponent;
//	    }
	    
	    //Solution 2
	    for (int i =1; i<=exponent; i++) {
	    	result *=base;
	    }
	    
	    System.out.println("Answer = " + result);
	}

	private static void reverseNumber() {
		// TODO Auto-generated method stub
	    int num = 1234, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      System.out.println("digit"+digit);
	    
	      reversed = reversed * 10 + digit;
	      System.out.println("reversed"+reversed);

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
		
	}

	public static void displayAlphabets() {
	    char c;

	    for(c = 'A'; c <= 'Z'; c++) {
	      System.out.print(c + " ");
	    }
	}
	
	public static void digitsCount21a() {
	    int count = 0, num = 00043452;
	    while (num != 0) {
	      num /= 10;
	      ++count;
	    }
	    System.out.println("Number of digits: " + count);
	}
	
	public static void digitsCount21b() {
	    int count = 0, num = 1234567;
	    for (; num != 0; num /= 10, ++count) {
	    }
	    System.out.println("Number of digits: " + count);
	}
}
