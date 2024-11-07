package Collection_Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Remove_Duplicates_Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(20);
		list2.add(30);
		list2.add(20);
		list2.add(40);
		list2.add(33);
		list2.add(30);
		list2.add(44);
		list2.add(30);
		list2.add(40);
		list2.add(22);
		System.out.println(list2);
		LinkedHashSet<Integer> list3 = new LinkedHashSet<Integer>();
		list3.addAll(list2);
		
		System.out.println(list3);
		

	}

}
