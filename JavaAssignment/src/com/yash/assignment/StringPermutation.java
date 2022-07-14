package com.yash.assignment;

import java.util.*;
import java.util.Scanner;

public class StringPermutation {
	static void permute(String s, String answer)
	{
		if(s.length()==0)
		{
			System.out.print(answer + " ");
			return;
		}	
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			String lSubstr=s.substring(0,i);
			String rSubstr=s.substring(i+1);
			String rest=lSubstr+rSubstr;
			permute(rest,answer+ch);
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String s;
		String answer=" ";
		System.out.print("Enter the String : ");
		s=scan.next();
		
		System.out.println("\n All possible strings are : ");
		permute(s,answer);
	}

}
