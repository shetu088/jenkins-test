package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class maptest {

	
	Map<String , Integer> map;
	
	public maptest(Map map)
	{
		this.map = map;
	}
	
	public void addele()
	{
		map.put("India", 1);
		map.put("UK",2);
		map.put("India",10);
		map.putIfAbsent("india",20); // if the value is alredy present it will not get replaced
		map.put("China", 5);
		map.put("Nepal",10);
		
	}
	
	public void display()
	{
		System.out.println(map);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
maptest map = new maptest(new HashMap());
map.addele();
map.display();


		
		
	}

}
