package Codility.Lesson7;

import java.util.*;

public class Nesting {

	public Nesting() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String in2 = "fsds fsdf( sdfsd ) dfsdf sd(dsfsd)fsdfsdf sdf(fsdfsd(sfsd f)fsdf(sfsdf fds)";
		//String in2 = "([)()]";
		int result = solution(in2);
		System.out.println(result);
	}

    public static int solution(String S) {
        // write your code in Java SE 8
        Stack <Character> stack = new Stack<Character>();

       for(int i=0; i<S.length(); i++){
           char c = S.charAt(i);
           if (c == '('){
               stack.push(c);
           }else if(c ==')'){
               if(stack.size() ==0) {    
                   return 0;
               }else {
            	   stack.pop();
               }
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
