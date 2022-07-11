package com.yash.assignment;

import java.util.Scanner;

public class AverageMarks {
	public static void main(String args[])
	{
		/*
		int i;
		int n=args.length;
		double avg=0;
		
		for(i=0;i<n;i++)
		{
			avg=avg+Integer.parseInt(args[i]);
		}
		System.out.print("Average Marks of (");
		
		for(i=0;i<n-1;i++)
		{
			System.out.print(args[i]+",");
		}
		
		System.out.println(args[1]+")=" + avg/n);
	    */
		
		int marks[]=new int[5],i;
		float sum=0,avg;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter marks of 5 subjects : ");
		for(i=0;i<5;i++)
		{
			marks[i]=scan.nextInt();
			sum=sum+marks[i];
		}
		
		avg=sum/5;
		
		System.out.print("Average marks = " + avg);
		
		
	
	}

}
