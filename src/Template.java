import java.util.*;

public class Template {

	public Template() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		template1();
	}
	
	public static void template1() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		int n;
		//{3,10 ,5,6,7,4};
		
		arr.add(6);
		arr.add(10);
		arr.add(1);
		arr.add(23);
		arr.add(2);
		
		arr.contains(o)
		
		//Arrays.sort(arr);
		
		Collections.sort(arr);
		System.out.println(arr);		
		Collections.reverse(arr);
		System.out.println(arr);

		
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i<arr.size(); i++) {
			set.con add(arr.get(i));
		}
		
		if(set.size()>2) {
			//ArrayList<Integer> arr3= (Integer) set.toArray();
			arr2.add ((Integer) set.toArray()[0]);
			arr2.add ((Integer) set.toArray()[1]);
			arr2.add ((Integer) set.toArray()[2]);
		}else {
			arr2.add(0);
		}

		return arr2;
	}

}
