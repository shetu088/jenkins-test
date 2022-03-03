package primeNo;

public class primetest1 {

	public static void main(String[] args) {
		int n = 11;
		int flag = 0;
		int m = n/2;
		
		if(n==0||n==1)
		{
			System.out.println("this is not a a prime no ");
		}
		else
			for(int i=2 ;i<m;i++)
			{
				if(n%i==0)
				{
					
					System.out.println("it is not a prime no");
					flag = 1;
					break;
				
				}
				
		
			}
		
		if(flag==0)
		{
			System.out.println("it is a prime no");
		}
	}

}
