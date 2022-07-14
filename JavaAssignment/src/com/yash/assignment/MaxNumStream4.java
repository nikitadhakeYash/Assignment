package com.yash.assignment;

import java.util.Scanner;

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxNumStream4 {

	public static void main(String[] args)
	{
        int num[]=new int[5];
		Scanner scanner=new Scanner(System.in);
		//take numbers from user
		System.out.print("Enter numbers : \t");
		for(int i=0;i<5;i++)
		{
		  num[i]=scanner.nextInt();
		}
		System.out.println(num);
		
		//sorting names
		int max=Arrays.stream(num).max().getAsInt();
		System.out.println("Maximum number is := " + max);
		

		

	}
}
