package com.yash.assignment;

import java.util.HashSet;

public class DistinctMarks {
	static void printDistinctMarks(int arr[])
	{
		HashSet<Integer> set=new HashSet<>();
	     //traverce array
	    for(int i=0;i<arr.length;i++)
		{
			//check if present or not if not put into hashset
			if(!set.contains(arr[i]))
			{
				set.add(arr[i]);
				System.out.print(arr[i] + " ");
			}
		}
	
	}
	
	public static void main(String [] args)
	{
		int arr[]={10,5,3,4,3,5,6};
		printDistinctMarks(arr);
		
	}
}
