package geeks;

import java.util.HashMap;

public class FirstNotRepeat {

	public FirstNotRepeat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S = "zxvczbtxyzvy";
		
		HashMap <String,Integer> hm = new HashMap<String,Integer> ();
	     
	     for(int i =0; i < S.length(); i++){
	    	 String c = S.substring(i, i+1);
	         //System.out.println(c);
	         if(hm.containsKey(c)) {
	        	 hm.replace(c, 1);
	         }else {
	        	 hm.put(c, 0);	 
	         }
	     }
	     hm.forEach((k, v) -> {
	    	 if (v ==0) {
	    		 System.out.println(k);
	    	 }
	     });
	}

}


