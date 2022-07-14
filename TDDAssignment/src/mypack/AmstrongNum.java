package mypack;

public class AmstrongNum {
	
	public static boolean isAmstrong(int num)
	{
		if(num < 0)
			throw new RuntimeException("Number is negative");
		 int digit=getNumOfDigits(num);
		 int sum=0;
		 int originalNum=num;
		 
		 while(num > 0) {
			 int rem=num % 10;
			 num= num/10;
			 
			sum=sum +(int)Math.pow(rem, digit);
		 }
		 
		 System.out.println("Digits : " + digit);
		 System.out.println("Sum : " + sum);
 
		 
		 return originalNum == sum;
	}
	
	private static int getNumOfDigits(int num)
	{
		int count=0;
		while(num > 0) {
			count++;
			num=num/10;
		}
		return count;
	}
	public static void main(String[] args)
	{
		 System.out.println(isAmstrong(370));
	
	}

}
