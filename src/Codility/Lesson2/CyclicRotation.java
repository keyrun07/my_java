package Codility.Lesson2;

public class CyclicRotation {

	public CyclicRotation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {5,6,7,8,4,2,7,1};
		int K =2;
        int temp = 0;
        int len = A.length;
        
        if(len <1) {
        	System.out.println(A.toString());
        	System.exit(0);
        }

        for( int i =0; i<K; i++){
            temp = A[len-1];
            for( int j = A.length -1; j>0; j--){
                A[j] = A[j-1];
            }
            A[0]=temp;
        }
        System.out.println(A.toString());
	}
}