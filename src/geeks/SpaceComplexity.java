package geeks;

public class SpaceComplexity {

	public SpaceComplexity() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpaceComplexity s = new SpaceComplexity();
		System.out.println(s.add(5));
		//System.out.println(s.addSequence(5));

	}
	int add (int n){
		System.out.println(n);
	    if (n <= 0){
	    	
	        return 0;
	        
	    }
	    return add (n-1) ;
	}
	
	int addSequence (int n){
	    int sum = 0;
	    for (int i = 0; i < n; i++){
	        sum += pairSum(i, i+1);
	    }
	    return sum;
	}

	int pairSum(int x, int y){
	    return x + y;
	}

}
