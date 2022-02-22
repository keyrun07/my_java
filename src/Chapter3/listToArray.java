package Chapter3;
import java.util.List;
import java.util.ArrayList;

public class listToArray {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); // 2
		System.out.println(objectArray[0]); // 2
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length); // 2
		System.out.println(list.toArray()); // 2


	}
}
