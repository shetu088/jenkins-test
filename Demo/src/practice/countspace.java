package practice;

public class countspace {

	public static void main(String[] args) {
		
		String name = "My Name is Shreshtha Singhal";
		int count = 0;
		
		
		for(int i = 0 ; i < name.length() ;i++)
		{
			
			if(name.charAt(i) == ' ')
			{
				count++;
			}
		}

		
		System.out.println(count);
	}

}
