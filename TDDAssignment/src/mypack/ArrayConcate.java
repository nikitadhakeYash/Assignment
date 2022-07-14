package mypack;

import java.util.StringJoiner;
import java.util.regex.Pattern;

public class ArrayConcate {
	
	public boolean compareString(String str,String[] str_array) 
	{
		Pattern pattern=Pattern.compile("-");
		String[] newStr=pattern.split(str);
		//System.out.println(newStr);
		
//		for(int i=0;i<newStr.length;i++) {
//		System.out.println(newStr[i]);
//		}
		if(newStr==str_array) 
			return true;
		else return false;
			
		
	}
	
	public static void main(String args[])
	{
		ArrayConcate obj=new ArrayConcate();
		String[] str_array= {"apple","banana","orange","lemon"};
		StringJoiner joiner=new StringJoiner("-");
		for(int i=0;i<str_array.length;i++) {
			joiner.add(str_array[i]);
		}
		String str=joiner.toString();
		System.out.println(str);
		obj.compareString(str,str_array);
	}
	

}
