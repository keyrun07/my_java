package Codility.Lesson1;

public class BinaryGap {

	public BinaryGap() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int in = 328;//1041;//9;
		String bin = Integer.toBinaryString(in);
		int len = bin.length();
		int maxLen = 0;
		int count = 0;
		boolean isCounting = false;
		
		//System.out.println("Len"+ len);
		//System.out.println(bin);
		for(int i=0; i<len; i++) {
			//System.out.println(bin.charAt(i));
			if(bin.charAt(i) == '1' && isCounting == false) {
				//System.out.println("counting START"+bin.charAt(i));
				isCounting = true;
				count = 0;
			}
			//System.out.println("isCounting"+isCounting);
			if(bin.charAt(i) == '0' && isCounting){
				//System.out.println("counting"+bin.charAt(i));
				count++;
			}
			
			if(bin.charAt(i) == '1' && isCounting && count>0){
				isCounting =true;
				//System.out.println("counting END"+bin.charAt(i));
				if( maxLen< count) {
					maxLen = count;	
				}
				count =0;
			}
			
		}
		System.out.println(maxLen);

	}

}
