package programIZ;

import java.util.ArrayList;

public class SortArrayListObject {

	private String customProperty;

	public SortArrayListObject(String property) {
		this.customProperty = property;
	}

	public String getCustomProperty() {
		return this.customProperty;
	}

	public static void main(String[] args) {

		ArrayList<SortArrayListObject> list = new ArrayList<>();
		list.add(new SortArrayListObject("Z"));
		list.add(new SortArrayListObject("A"));
		list.add(new SortArrayListObject("B"));
		list.add(new SortArrayListObject("X"));
		list.add(new SortArrayListObject("Aa"));

		// list.sort((o1, o2) ->
		// o1.getCustomProperty().compareTo(o2.getCustomProperty()));
		list.sort((o1, o2) -> o2.getCustomProperty().compareTo(o1.getCustomProperty()));

		for (SortArrayListObject obj : list) {
			System.out.println(obj.getCustomProperty());
		}
	}

}
