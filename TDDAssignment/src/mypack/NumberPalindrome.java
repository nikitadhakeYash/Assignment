package mypack;

public class NumberPalindrome {
	
	public static boolean isNumPalindrome(int num)
	{
		if(num<0)
			throw new RuntimeException("Number is negative please pass positive number");
		int originalNum=num;
		int reversedNum=0;
		
		while(originalNum > 0)
		{
			int reminder=originalNum%10;
			originalNum=originalNum / 10;
			
			reversedNum=reversedNum * 10 + reminder;
			
		}
		return num == reversedNum;
		
	}
	public static void main(String[] args)
	{
		System.out.println(isNumPalindrome(452));
	}

}
