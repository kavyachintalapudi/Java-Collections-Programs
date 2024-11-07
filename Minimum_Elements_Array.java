package Collection_Programs;

import java.util.ArrayList;

public class Minimum_Elements_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 =  new ArrayList<Integer>();
		list1.add(101);
		list1.add(302);
		list1.add(202);
		list1.add(77);
		list1.add(65);
		list1.add(34);
		list1.add(233);
		list1.add(54);
		System.out.println(list1);
		int min=list1.get(0);
		int index=0;
		for(int i=0;i<list1.size();i++)
		{
			if(min>list1.get(i))
			{
			min = list1.get(i);
			index=i;
		}
		}
		System.out.println("MIn:"+min);
		System.out.println("INDEX:"+index);
		list1.remove(index);
		int total=0;
		for(int i=0;i<list1.size();i++)
		{
			total=total+list1.get(i);
		}
		System.out.println(total);
		
	}


}
