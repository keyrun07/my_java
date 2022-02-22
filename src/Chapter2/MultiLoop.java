package Chapter2;

public class MultiLoop {

	public MultiLoop() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}}; 
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println(); 
		}

	}

}
