package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_list_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(30);
		list1.add(80);
		list1.add(90);
		list1.add(50);
		list1.add(40);
		list1.add(60);
		System.out.println(list1);
		Collections.reverse(list1);
		System.out.println(list1);

	}

}
