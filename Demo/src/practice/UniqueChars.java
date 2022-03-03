package practice;

import java.util.LinkedHashSet;

public class UniqueChars {

	LinkedHashSet<Character>lset1; 
	
	// to maintain the order of insertion thats why 
   //we have used linked hashset
	
	LinkedHashSet<Character>lset2;
	
	UniqueChars()
	{
		    lset1= new LinkedHashSet<>();
			lset2= new LinkedHashSet<>();
			
			
	}
	
	public int add(String str)
	{
		for(int i = 0 ; i<str.length();i++)
		{
			if(!(lset1.add(str.charAt(i))))
			{
				
			   lset2.add(str.charAt(i));
			  
			}
		}
		
		
		lset1.removeAll(lset2);
		
		
		
		if(lset1.size()==0)
		{
			return -1;
		}
		else
		{
			return lset1.size();
		
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniqueChars uc = new UniqueChars();
		System.out.println(uc.add("HelloWorld"));
		
		
		
	}

}
