package DataStructure;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalanceBrakets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
      // Using ArrayDeque is faster than using Stack class 
        //Deque<Character> stack = new ArrayDeque<Character>(); 
        Stack<Character> stack = new Stack<Character>(); 
        // Traversing the Expression 
        for (int i = 0; i < s.length(); i++) { 
            char x = s.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{') { 
                // Push the element in the stack 
                stack.push(x); 
                continue; 
            } 
  
            // IF current current character is not opening 
            // bracket, then it must be closing. So stack 
            // cannot be empty at this point. 
            if (stack.isEmpty()) 
                return "NO"; 
  
            switch (x) { 
            case ')': 
                x= stack.pop(); 
                if (x == '{' || x == '[') 
                    return "NO"; 
                break; 
  
            case '}': 
                x= stack.pop(); 
                if (x == '(' || x == '[') 
                    return "NO"; 
                break; 
  
            case ']': 
               x=  stack.pop(); 
                if (x == '(' || x == '{') 
                    return "NO"; 
                break; 
            } 
        } 
  
        // Check Empty Stack 
        return stack.isEmpty()?"YES":"NO";  
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
