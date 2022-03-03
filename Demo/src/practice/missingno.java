package practice;

public class missingno {

	public static void main(String[] args) {
		
		int[] n = {1 , 2, 4 ,5 , 6};
		int num = n.length;
		int sum = ((num+1)*(num+2))/2;
		
		for(int i =0 ;i<num ;i++)
		{
			sum = sum-n[i];
		}

		
		System.out.println(sum);
	}

}
