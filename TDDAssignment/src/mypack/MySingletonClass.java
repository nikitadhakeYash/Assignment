package mypack;

public class MySingletonClass {
	
	private static volatile MySingletonClass singletoneInstance=new MySingletonClass();
	
	private MySingletonClass()
	{
		
	}
	
	public static MySingletonClass getInstance()
	{
		return singletoneInstance;
	}

}
