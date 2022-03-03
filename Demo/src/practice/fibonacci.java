package practice;

public class fibonacci {

	public static void main(String[] args) {

		int first = 0 ;
		int next , second=1;
		int no = 10;
		for(int i=0;i<=no;++i)
		{
	        System.out.print(" "+first);
			next = first + second;
			first = second;
			second = next;
		}

		
		

	}

}
