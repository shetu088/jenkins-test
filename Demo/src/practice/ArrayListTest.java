package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
	
	String str[] = {"Sunil-34-45-56","Shreshtha-65-67-89","Pranjal-56-45-67"};
	ArrayList<String>list;
	int max;
	String maxscorer;
	ArrayListTest()
	{
		list = new ArrayList(Arrays.asList(str));
	}
	
	
	public String result()
	{
		int sum = 0;
		for(int i = 0 ; i<list.size();i++)
		{
			String temp[] = list.get(i).split("-");
			
			for(int j=1 ; j<temp.length ; j++)
			{
				sum = sum + Integer.parseInt(temp[j]);
				//System.out.println(sum);
				
			}
			
			if(sum>max)
			{
				max = sum;
				System.out.println(max);
				maxscorer = temp[0];
				
			}
			
		}
		
		
		return maxscorer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayListTest art = new ArrayListTest();
System.out.println(art.result());
	}

}
