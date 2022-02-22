
public class Varargs {

	public Varargs() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = {4,6,3,8};
		Varargs v = new Varargs();
		v.printVarArgArray(5,7,4);
	}
	
	public void printVarArgArray(int... x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + ",");
        }
    }

}
