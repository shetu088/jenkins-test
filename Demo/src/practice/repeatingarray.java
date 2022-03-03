package practice;

public class repeatingarray {

	public static void main(String[] args) {

      int no[] = {1 , 2, 3 , 3 , 2, 1 ,4};
    
      int j=0;
      for(int i = 0 ; i<no.length;i++)
      {
    	  for( j =i+1 ; j <no.length;j++)
    	  {
    		  if(no[i]==no[j] && i!=j)
    		  {
    			  System.out.println(no[j]);
    			 
    		  }
    		  
      }
    	 
    	  
    	 
    	 
    	  
    	  
    	 
      }

	}

}
