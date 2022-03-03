package practice;

import java.util.HashMap;

public class occurenceofeachcharacter {

	public static void main(String[] args) {
		
		
		HashMap<Character , Integer>  map = new HashMap<Character , Integer>();
		
		String s = "all is well";
		char[] test = s.toCharArray();
		
		for(char c : test)
		{
			   if(map.containsKey(c))
			   {
				   map.put(c, map.get(c)+1);
			   }
			   
			   else
				   
				   map.put(c,1);
		}
		
		System.out.println(map);
		
		
	}

}
