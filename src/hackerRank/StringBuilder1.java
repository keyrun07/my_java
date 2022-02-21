package hackerRank;

public class StringBuilder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="kiranawal";
		
		
		System.out.println(s.substring(3, 8));
		System.out.println(s.substring(0, s.length()));
		
		int k = 3;
	      StringBuilder sb = new StringBuilder(10);
	        for(int i =0; i< s.length()-k+1; i++ ){
	            sb.append(s.substring(i, i+k));            
	        }
	        System.out.println(sb);
	}

}
