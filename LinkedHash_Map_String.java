package Collection_Programs;

import java.util.LinkedHashMap;

public class LinkedHash_Map_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,String> map1 = new LinkedHashMap<String,String>();
		map1.put("hai","xyz");
		map1.put("abc", "mata");
		map1.put("def","meta");
		map1.put("ghf","rata");
		map1.put("hkl",null);
		map1.put(null, "geeta");
		System.out.println(map1);
		System.out.println(map1.size());
		System.out.println("*******************");
		for (String value : map1.values()) {
			System.out.println(value);
			
		}
		System.out.println("#################");
		for (String key : map1.keySet()) {
			System.out.println(key);
			
		}
	}

}
