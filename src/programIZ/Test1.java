package programIZ;

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
		reverseSentence();
	}
	
	private static void reverseSentence() {
		// TODO Auto-generated method stub
		
		  String sentence = "Go work";
		    String reversed = reverseSentence(sentence);
		    System.out.println("The reversed sentence is: " + reversed);
		  }

	  public static String reverseSentence(String sentence) {
	    if (sentence.isEmpty())
	      return sentence;
	    
	    System.out.println("Before - sentence.substring(1): "+ sentence.substring(1));
	    System.out.println("Before - sentence.charAt(0): " + sentence.charAt(0));
	    String rS =  reverseSentence(sentence.substring(1)) + sentence.charAt(0);
	    
	    System.out.println("sentence.substring(1): "+ sentence.substring(1));
	    System.out.println("sentence.charAt(0): " + sentence.charAt(0));
	    System.out.println(rS);
	    
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
