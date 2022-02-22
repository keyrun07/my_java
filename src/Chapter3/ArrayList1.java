package Chapter3;
import java.util.List;
import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String args[]) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		ArrayList list4= list2;
		list2.add(5) ;
		list2.add(Boolean.TRUE); // [hawk, true]
		System.out.println(list2); // [hawk, true]
		System.out.println(list3); // [hawk, true]
		System.out.println(list4); // [hawk, true]

		
		ArrayList<String> safer = new ArrayList<>(3);
		safer.add(0, "sparrow");
		safer.add(1, "crow");
		//safer.add(Boolean.TRUE); // DOES NOT COMPILE
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		
		
		
		ArrayList<String> birds2 = new ArrayList<>();

		birds2.add("hawk1"); // [hawk]
		birds2.add("hawk2"); // [hawk, hawk]
		System.out.println(birds2.remove("cardinal")); // prints false
		System.out.println(birds2.remove("hawk1")); // prints true
		
		System.out.println(birds2.remove(0)); // prints hawk
		System.out.println(birds2); // []
		
		System.out.println("------- birds3 --------"); // []
		List<String> birds3 = new ArrayList<>(3);
		birds3.add("hawk"); // [hawk]
		System.out.println(birds3.size()); // 1
		birds3.set(0, "robin"); // [robin]
		System.out.println(birds.size()); // 1
		birds3.set(2, "robin"); // IndexOutOfBoundsException
		

		
		
	}
	
	public void walk4(int[] start, int nums) {
		
	}
}
