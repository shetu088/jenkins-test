package practice;

import java.util.Comparator;

public class IDComparator implements Comparator<EmployeeData> {

	

	
	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {
		if(o1.getName().compareTo(o2.getName())>1)
		
		return 1;
		
		else if(o1.getName().compareTo(o2.getName())==0)
		{
			return 0;
		}
		else
			return -1;
		
	}

}
