package Collection_Programs;

import java.util.TreeMap;

public class Tree_Map_Integer_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map1 = new TreeMap<Integer,String>();
		map1.put(101,"Kavya");
		map1.put(503, "null");
		map1.put(409,"hello");
		map1.put(307,"geeta");
		map1.put(404,"tata");
		map1.put(209,"meta");
		map1.put(609,null);
		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println(map1.get(101));
		System.out.println(map1.get(409));

	}

}
