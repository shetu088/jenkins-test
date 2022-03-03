package practice;

import java.util.TreeMap;

public class nonrepeatingno {

	public static void main(String[] args) {
		// in sorted manner
		
		TreeMap<Integer , Integer> map = new TreeMap<Integer , Integer>();
		 
		  int[] nums = {2,11,3,11,7,3,9,2};
		  int i = 0 ;
		
		for( i = 0 ; i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
				map.remove(nums[i]);
			}
			
			else
			{
				map.put(nums[i],1);
			}
		}
		
		System.out.println("The non-repeating integers are " + map.firstKey() +" "+map.lastKey());

	}

}
