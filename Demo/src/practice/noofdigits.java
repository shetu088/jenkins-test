package practice;

public class noofdigits {

	public static void main(String[] args) {
		
		int no = 1234;
		int count = 0;
		
		while(no!=0)
		{
			no=no/10;
			++count;
			
		}

		
		System.out.println(count);
	}

}
