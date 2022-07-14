package mypack;

import java.util.Scanner;

public class CountVowel
{
    
	public static int calVowel(String str)
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter String");
		//String s1=sc.nextLine();
		
//	    int l=s1.length();
//		char ch;
//		int c=0;
//		String s=s1.toLowerCase();		
//	
//		
//		for(int i=0;i<l;i++)
//		{
//			ch=s.charAt(i);
//			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				c++;
//			}
//		}
//		System.out.print("Total no of vowels are : " + c);

		
		int vowelCount=0;
		char[] chars=str.toCharArray();
		
		for(char ch : chars)
		{
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowelCount++;
			}
		}
		System.out.print(vowelCount);
		return vowelCount;
		
		
	}
	
	public static void main(String[] args)
	{
		CountVowel obj=new CountVowel();
		obj.calVowel("wellcome");
		
	}
}
