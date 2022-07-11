package com.yash.assignment;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EvenOddFromList9 {

	public static void main(String[] args)
	{
		int ctnEven=0,ctnOdd=0;
        int nlist[]=new int[5];	
	    Scanner scan=new Scanner(System.in);
		
		System.out.print("ENter the numbers : ");
		for(int i=0;i<5;i++)
		{
		   nlist[i]=scan.nextInt();
		}
		System.out.println(nlist);
	    for(int i=0;i<nlist.length;i++)
		{
			if(nlist[i] % 2 == 0){
			ctnEven++;
			}
			else{
				ctnOdd++;
			}
		}
		
		System.out.println("number of even in the list : "  + ctnEven);
		System.out.println("number of even in the list : "  + ctnOdd);

	}
}
