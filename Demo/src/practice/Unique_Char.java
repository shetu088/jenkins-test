package practice;

public class Unique_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = "SHRESHTHA";
		char[] arr = s.toCharArray();
		int count = 0 ;
	
		
		for(int i = 0 ; i<=s.length()-1  ;i++)
		{
			for(int j =i+1 ; j<s.length()-1 ; j++)
			{
				if(arr[i]==arr[j+1] && !(i==j))
				{
					count++;
					System.out.println(arr[j]);
				}
			}
			
		}

	}

}
