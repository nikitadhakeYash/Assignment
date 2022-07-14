package com.yash.assignment;

import java.util.List;
import java.util.Optional;
import java.util.Arrays;

public class MaxWithLambda12 {
	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,6,4,9,66);
		
		Optional<Integer> maxNum=list.stream().max((i,j)->i.compareTo(j));
		
		System.out.println(maxNum.get());
	}
}
