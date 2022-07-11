package com.yash.assignment;
import java.util.Scanner;


public class EvenORNot {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("ENter the number : ");
		int num=scan.nextInt();
		String evenOdd=(num % 2 ==0)?"even":"odd";
		System.out.println(num + " is " + evenOdd);
	}
}
