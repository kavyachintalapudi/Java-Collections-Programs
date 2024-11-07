package Collection_Programs;

import java.util.ArrayList;

public class Sub_List_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("seeta");
		list2.add("geeta");
		list2.add("reeta");
		list2.add("meeta");
		list2.add("bata");
		list2.add("tata");
		System.out.println(list2);
		ArrayList<String> list3 = new ArrayList<>();
		
		
		list3.addAll(list2.subList(2, 5));

		System.out.println(list3);
	}

}
