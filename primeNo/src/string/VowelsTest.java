package string;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VowelsTest {

	public static void main(String[] args) {
		
		
		String str = new String("bcdfghrt");
		String newname = "";
		int count = 0;
		
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				count++;
			}
		}

		
		if(count>0)
		{
			System.out.println("THE STRING HAVE VOWELS");
		}
		else
		{
			System.out.println("THE String doesnt have any vowels");
		}
		
	}

}


