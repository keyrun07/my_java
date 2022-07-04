package Codility.Lesson3;

public class FrogJump {

	public FrogJump() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = solution(10, 85, 30);
		System.out.println (result);
	}
	
	public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
		int remJump  = Y-X;

        int CountJump = (int)remJump/D;
        //System.out.println(CountJump);
        int rem = remJump%D;
        if (rem!=0) {
        	CountJump++;
        }
        return CountJump;
    }

}
