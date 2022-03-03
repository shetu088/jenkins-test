package primeNo;

public class PrimeNo {

	public static void main(String[] args) {
	
	int i = 0;
	int n = 0;
    String prime = "";
    
	
    for(i = 1 ;i<=50;i++)
    {
    	int count = 0;
    	
    	for(n = i;n>=1;n--)
    	
    	{
    		
    		if(i%n==0)
    		{   
    			
    			count++;
    		}
        }
    	
    	if(count==2)
    	
    	{
    		 prime = prime + i + " ";
    		
    	}
    	
    }
	
       System.out.println("Prime numbers from 1 to 50 is : " + prime);
	
}
}
