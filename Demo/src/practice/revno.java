package practice;

public class revno {

	public static void main(String[] args) {
		int no = 1234;
		int rev = 0 , r;
	
		while(no>0)
		 {
			r = no%10;
			rev = rev*10 + r;
			no = no/10;
		 }
		
		System.out.println(rev);
	}

}
