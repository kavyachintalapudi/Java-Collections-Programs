package Collection_Programs;

import java.util.ArrayList;

public class Replace_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(33);
		list2.add(28);
		list2.add(44);
		list2.add(55);
		list2.add(11);
		System.out.println(list2);
		list2.remove(4);
		list2.add(4,82);
		System.out.println(list2);

	}

}
