package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveCollection {

	
	List<Integer> list;
	List<Integer> list1;
	
	RemoveCollection()
	{
	    list = new ArrayList<Integer>();
	    list1 = new ArrayList<Integer>();
	}
	
	public void addele()
	{
		list.add(3);
		list.add(1);
		list.add(11);
		list.add(19);
		list.add(17);
		list.add(19);
		
		
	}
	
	public List result()
	{
		
		
		Iterator it = list.iterator();
		
		int count = 0 ;
		
		while(it.hasNext())
			
			
		{   
			int i = (int) it.next();
			
			count++;
			
			if(count%3==0)
			{
				it.remove();
				
				list1.add(i);
			}
			  
			
		}
		
		return list;
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemoveCollection  rc = new RemoveCollection();
		rc.addele();
		System.out.println("The result is "+rc.result());
	}

}
