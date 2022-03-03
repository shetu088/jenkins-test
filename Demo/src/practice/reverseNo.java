package practice;

public class reverseNo {

	public static void main(String[] args) {
		
		int rev = 0 , r;
		int no = 1234;
	
		
		while(no>0)
		{
			r = no%10;
			rev = rev*10 + r;
			no = no/10;
		}

		
		System.out.println(rev);
	}

}
