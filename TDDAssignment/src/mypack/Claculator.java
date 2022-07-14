package mypack;

public class Claculator {
	
	public double add(double a,double b)
	{   
		return a+b;
		
	}

	public double substract(double a,double b)
	{
		return a-b;
	}	
	
	public double multiply(double a,double b)
	{
		return a*b;
	}
	
	public double divide(double a,double b)
	{
		if(b==0)
		  throw new IllegalArgumentException("Can not divide by zero");
		return a/b;
	}
	
	public double mod(double a,double b)
	{

		return a%b;
	}
	
	public double squareroot(int num)
	{
		if(num<0)
			  throw new IllegalArgumentException("Can not be negative");
		
		double sqrt=Math.sqrt(num);
		return sqrt;
			
		
	}
	
	public double power(int a,int b)
	{
		if(b<0)
			  throw new IllegalArgumentException("Can not be negative");
		
		double pwr=Math.pow(a,b);
		return pwr;
			
		
	}
	
	public static void main(String[] args)
	{
		Claculator c=new Claculator();
		c.add(1, 1);
		//System.out.println(c.add(5,5));
//		System.out.println(c.substract(5,5));
//		System.out.println(c.multiply(5,0));
		System.out.println(c.divide(5,5));
		//System.out.println(c.mod(5,2));
		System.out.println(c.squareroot(4));
		System.out.println(c.power(3,4));

		
	}
}
