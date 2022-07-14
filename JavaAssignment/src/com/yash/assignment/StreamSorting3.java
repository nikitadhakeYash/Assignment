package com.yash.assignment;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamSorting3 {
	public static void main(String[] args)
	{
		List<String> elist=new ArrayList<String>();
		Scanner scanner=new Scanner(System.in);
		//take name from user
		for(int i=0;i<5;i++)
		{
		   System.out.print("Enter Employee name: \t");
		   elist.add(scanner.nextLine());
		}
		System.out.println(elist);
		
		//sorting names
		List<String> sortedelist=elist.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List := " + sortedelist);
		
		//print distinct name
		List<String> distinctList=sortedelist.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct List := " + distinctList);

		

	}

}
