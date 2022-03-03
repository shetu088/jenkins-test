package practice;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {
	
	//Given a method with a HasMap<int,float> as input. 
	//Write code to find out average of all values whose 
	//keys are even numbers. Round the average to two 
	//decimal places and return as output.


			//Example:

			//Input: {1:2.3,2:4.1,6:6.2}

			//Output: (4.1+6.2)/2=10.3/2=5.15
	
	
	HashMap<Integer,Float>list;
	
	MapDemo()
	{
		list = new HashMap<Integer,Float>();
	}
	
	public void add()
	{
		
		list.put(1,2.3f);
		list.put(2, 4.1f);
		list.put(6,6.2f);
		
	}
	
	public String result()
	{
		float sum = 0.0f;
		int count = 0 ;
		for(Integer i : list.keySet())
		{
			System.out.println(list.get(i));
			
			if(i%2==0)
				
			{
				sum = sum+list.get(i);
				System.out.println(sum);
				count++;
				
			}
			
			
		}
		float avg = sum/count;
		
		return String.format("%.2f",avg);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapDemo md = new MapDemo();
		md.add();
		System.out.println(md.result());
		
		
	}

}
