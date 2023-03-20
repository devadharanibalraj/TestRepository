package org.ArrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] arr = {4,6,2,1,3}; //Primitive Array
		System.out.println("----------Before Sorting------------------");
		for(int i: arr)
			System.out.println(i);
		System.out.println("----------After Sorting------------------");
		Arrays.sort(arr);
		for(int i: arr)
			System.out.println(i);*/
		
	/*	String[] names = {"Arul","Nithis","Kavin","Vinoth","Jagathesh"};
		
		System.out.println("___________String Array Before Sorting_____________");
		for(String s: names)
			System.out.println(s);
		/*System.out.println("___________String Array After Sorting_____________");
		Arrays.sort(names);
		for(String s: names)
			System.out.println(s);*/
		
		/*int length = names.length;
		
		System.out.println("+++++++++++ loop sorting+++++++++++++++++");
		for(int i=0; i<length;i++)
		{
			 a[0]= 
			 
			System.out.println(names[i]);
		}*/
		
		/*Comparator comp = new ArraySort();
		Arrays.sort(names,comp);
		System.out.println("___________String Array After Comp Sorting_____________");
		
		for(String s: names)
			System.out.println(s);
		

	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		String s1= (String)o1;
		String s2 =(String)o2;
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		
		if(s1.length()>s2.length()) {
			System.out.println(s1 + " S1 length is greater" + s1.length());
			return -1;
		}
		if(s1.length()<s2.length()) {
			System.out.println(s2 + " S2 length is greater"+ s2.length());
			return +1;
		}
		else 
		{
			System.out.println(s1 + s2);
			System.out.println(s1.length());
			System.out.println(s2.length());
		    return 0;
		    
	
	}*/
	
	

	}

	

}
