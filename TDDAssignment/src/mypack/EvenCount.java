package mypack;

public class EvenCount {
	
	public static int calEven(int arr[],int arr_size)
	{
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<arr_size;i++ )
		{
			if((arr[i] & 1)==1)
				odd_count++;
			else even_count++;
		}
		System.out.println(even_count);
		System.out.println(odd_count);

		return even_count;
	}
	
	public static void main(String[] args)
	{
		int arr[]= {2,3,4,5,6};
		int n=arr.length;
		calEven(arr,n);
	}

}
