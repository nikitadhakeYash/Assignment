package mypack;

public class HCFofNum {
	
	 public static int getHCF(int a,int b)
	{
		return b==0?a:getHCF(b,a%b);
	}
	
	public static void main(String[] args)
	{
		int num1=36,num2=60,hcf;
		
		hcf=getHCF(num1,num2);
		System.out.println("The HCF: " +hcf );
	}

}
