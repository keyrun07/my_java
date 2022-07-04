package Codility.Lesson7;

import java.util.*;

public class Brackets {

	public Brackets() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in2 = "{[()()]}";
		//String in2 = "([)()]";
		int result = solution(in2);
		System.out.println(result);
	}

    public static int solution(String S) {
        // write your code in Java SE 8
        Stack <Character> stack = new Stack<Character>();

       for(int i=0; i<S.length(); i++){
           char c = S.charAt(i);
           if (c == '{' || c == '[' || c == '('){
               stack.push(c);
           }else if(stack.size()>0){
           if(c ==')'){
               if(stack.pop() != '(')    
                   return 0;
           }
           if(c ==']'){
               if( stack.pop() != '[')
                   return 0;
           }
           if(c =='}'){
               if(stack.pop() != '{')
                   return 0;
           }
           }else{
               return 0;
           }
           //System.out.println(c);
       }
       if(stack.size()==0){
       return 1;
       }else{
           return 0;
       }

    }

}
