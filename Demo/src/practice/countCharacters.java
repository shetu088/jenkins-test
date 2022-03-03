package practice;

public class countCharacters {
	
	public static void main(String[] args) 
	{
		String s1 = "My name is shreshtha";
		int count = 1 ;
		
		
		for(int i = 0 ; i<s1.length()-1;i++)
		{
			if(s1.charAt(i)!= ' ')
			{
				count++;
			}
		}

		
		System.out.println("the tota no of characters :" + count);
	}

}
