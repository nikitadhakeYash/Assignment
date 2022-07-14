package mypack;

public class StringPalindrome {
	
	//first way
	/*
	public boolean isPalindrome(String str)
	{
		String reversedString=" ";
		for(int i= str.length()-1;i>=0;i--)
		
			reversedString=reversedString +str.charAt(i);
		
		System.out.println("Original String : " + str);
		System.out.println("ReversedString : " + reversedString);
		
		return str.equals(reversedString);
	}*/
	
	
	//Second way car compare
	public boolean isPalindrome(String str)
	{
		StringBuffer strBuffer=new StringBuffer(str);
		
		int startIndex=0;
		int endIndex=str.length()-1;
		boolean isNotEqual=true;
		
		for(int i=0;i<=str.length()/2;i++)
		{
			if(strBuffer.charAt(startIndex)== strBuffer.charAt(endIndex))
			{
				startIndex++;
				endIndex--;
				
			}else {
				isNotEqual=false;
				break;
			}
		}
		return isNotEqual;

	}
	
	
	public static void main(String[] args)
	{
		StringPalindrome obj=new StringPalindrome();
		System.out.println(obj.isPalindrome("apple"));
		
	}

}
