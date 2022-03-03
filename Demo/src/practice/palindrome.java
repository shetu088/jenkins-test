package practice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "my name is shreshtha";
	    String rev = "";
	    //String[] name = s.split(" ");
	    for(int i=s.length()-1;i>=0;i--)
	    {
	    	rev = rev + s.charAt(i);
	    	//System.out.println(name[i]+" ");
	    }
    
	    System.out.println(rev);
	    
	    if(rev.equalsIgnoreCase(s))
	    {
	    	System.out.println("it is a palindrome");
	    }
	    else
	    	System.out.println("it is not a palindrome");
	}

}
