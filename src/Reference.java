
public class Reference {
	String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reference r1 =new Reference();
		
		r1.name ="Kiran";
		
		//Reference r2 = r1;
		
		Reference r2 = new Reference();
		
		r2 = r1;
		
		r2.name="Parag";
		
		
		System.out.println(r1.name);
		changeName(r2);
		
		System.out.println(r1.name);
		System.out.println(12 / 3); // Outputs 3
		

	}
	
	public static void changeName(Reference r) {
		r.name = "Kevin";
		
	}

}
