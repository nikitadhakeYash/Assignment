package mypack;

public class RemovedSpecialChar {
	
     public boolean isContainSpeChar(String str)
     {
    	
    	 String newStr=str.replaceAll("[^a-zA-Z0-9]"," ");
 		System.out.println(newStr);
 		
 		if(str==newStr)
 			return true;
 		else return false;
    	 
     }

	
	public static void main(String atgs[])
	{
		RemovedSpecialChar obj=new RemovedSpecialChar();
		// String str="This @Red $car-";
//		 String newStr=str.replaceAll("[^a-zA-Z0-9]"," ");
//		System.out.println(newStr);
//		
//		if(str==newStr)
//			return true;
//		else return false;
		System.out.println(obj.isContainSpeChar("This @Red $Car"));
	}

}
