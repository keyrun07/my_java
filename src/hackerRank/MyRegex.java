package hackerRank;
import java.util.*;

public class MyRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Scanner in = new Scanner(System.in);
	      Arrays.asList(in);
	        while(in.hasNext()){
	            String IP = in.next();
	            System.out.println(IP.matches(MyRegex2.pattern));
	        }

	    }
	}

	class MyRegex2{
	    
	    public static String zeroTo255 = "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
	    public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\."
	                 + zeroTo255 + "\\." + zeroTo255;
	}