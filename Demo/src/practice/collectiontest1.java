package practice;
import java.util.*;

import org.openqa.selenium.WebDriver;
public class collectiontest1 {

	List list ;
	List list1;
	List list3;
	
	//WebDriver driver;
	
	collectiontest1(List list)
	{
		this.list = list;
		list1 = new ArrayList();
		list3 = new ArrayList();
	}
	
	public void addelements()
	{
		list.add(3);
		list.add(1);
		list.add(11);
		list.add(19);
		list.add(17);
		
		list1.add(5);
		list1.add(2);
		list1.add(6);
		list1.add(7);
		list1.add(20);
		
	list.addAll(list1);
			
	}
	
	public void display() {
		list.sort(null);
		System.out.println(list);
	}

	public void result()
	{
		//for(int i= 0 ; i<10 ; i++) {
			
		//	if(i%2 == 0)
		//	{
		//		System.out.println(list.get(i));
		//	}
		//}
		
		System.out.println(list.get(2));
		System.out.println(list.get(6));
		System.out.println(list.get(8));
	}
}
