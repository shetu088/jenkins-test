package practice;

public class ChangeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "ShresHTHA";
		int size = name.length();
		 char[] ch = name.toCharArray();
		
		for(int i = 0 ; i<size; i++)
		{
			if(ch[i]>= 'a' && ch[i]<='z')
			{
				
			 ch[i] = (char) (ch[i]-32);
			 
			}
			
			else if(ch[i]>='A'&& ch[i]<='Z')
			{
				ch[i] =(char) (ch[i]+32);
			}
		}
		
		System.out.println(ch);
	}

}
