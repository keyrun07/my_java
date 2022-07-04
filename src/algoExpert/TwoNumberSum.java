package algoExpert;

public class TwoNumberSum {

	public TwoNumberSum() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] output = twoNumberSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
		System.out.println(output);

	}
	
	
	  public static int[] twoNumberSum(int[] array, int targetSum) {
		    // Write your code here.
		    int a[] =  new int[2] ;

		    for(int i=0; i<array.length; i++){
		      for(int j=i; j<array.length; j++){
		        if(array[i]+array[j] == targetSum && array[i] != array[j]){
		          a[0]=array[i];
		          a[1]= array[j];
		        }
		          
		        }
		    }
		    return a;
		  }

}
