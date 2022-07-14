package mypack;

public class PythagorasTemp {
	
	public int pythagoT(int[] triple)
	{
		return triple[0]*triple[0] + triple[1]*triple[1] == triple[2] * triple[2]?1:0;
	}
	
	public static void main(String[] args)
	{
		int[] p1= {3,4,5};
		PythagorasTemp obj=new PythagorasTemp();
		obj.pythagoT(p1);
	}

}
