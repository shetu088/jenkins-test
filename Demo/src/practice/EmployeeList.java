package practice;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	
	ArrayList<EmployeeData>array;
	public EmployeeList() {
	array=new ArrayList<>();
	}
	public void addElement()
	{
	array.add(new EmployeeData(101,"abhay",21));
	array.add(new EmployeeData(100,"shreshtha",23));
	array.add(new EmployeeData(105,"hello",34));
	array.add(new EmployeeData(102,"gyan",40));
	array.add(new EmployeeData(104,"chaetan",50));
	array.add(new EmployeeData(103,"dog",10));
	}
	public void sortEmployees()
	{
	Collections.sort(array,new IDComparator());
	}
	public void displayEmployees()
	{
	array.forEach(emp->System.out.println(emp));
	}}



