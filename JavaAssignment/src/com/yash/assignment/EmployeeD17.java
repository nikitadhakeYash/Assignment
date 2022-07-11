package com.yash.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeD17 {
	
	public static void main(String[] args)
	{
		List<EmployeeAsmnt17> list=new ArrayList<EmployeeAsmnt17>();
		list.add(new EmployeeAsmnt17("pratik",LocalDate.of(2000, 07, 23),LocalDate.of(2015, 04, 19),LocalDate.of(2040, 11, 23),"indore","development",25000));
		list.add(new EmployeeAsmnt17("ajay",LocalDate.of(2000, 10, 5),LocalDate.of(2010, 06, 18),LocalDate.of(2030, 7, 23),"mumbai","testing",27000));
		list.add(new EmployeeAsmnt17("akash",LocalDate.of(2001, 05, 15),LocalDate.of(2014, 07, 15),LocalDate.of(2040, 7, 23),"banglore","development",28000));
		
		System.out.println("Employee in perticular department");
		
		Map<String,List<EmployeeAsmnt17>> empByDept=list.stream().collect(Collectors.groupingBy(EmployeeAsmnt17::getDepartment));
		
		Set<Entry<String,List<EmployeeAsmnt17>>> entrySet=empByDept.entrySet();
		for(Entry<String,List<EmployeeAsmnt17>> entry:entrySet)
		{
			System.out.println("--------------------------------------");
			System.out.println("Employee In "+entry.getKey()+ ": ");
			System.out.println("--------------------------------------");
			List<EmployeeAsmnt17> list1=entry.getValue();
			for(EmployeeAsmnt17 e : list1)
			{
				System.out.println(e.getEmpName());
			}
	
		}
		
		System.out.println("Highest Salary---");
		Map<String,Optional<EmployeeAsmnt17>> maxSalary=list.stream().collect(Collectors.groupingBy(EmployeeAsmnt17::getDepartment,Collectors.maxBy(Comparator.comparingDouble(EmployeeAsmnt17::getSalary))));
		maxSalary.entrySet().forEach(System.out::println);
		
		

		System.out.println("Lowest Salary---");
		Map<String,Optional<EmployeeAsmnt17>> minSalary=list.stream().collect(Collectors.groupingBy(EmployeeAsmnt17::getDepartment,Collectors.minBy(Comparator.comparingDouble(EmployeeAsmnt17::getSalary))));
		minSalary.entrySet().forEach(System.out::println);
		
		
		System.out.println("Average Salary---");
		Map<String,Double> avgSalaryOfDepartment=list.stream().collect(Collectors.groupingBy(EmployeeAsmnt17::getDepartment,Collectors.averagingDouble(EmployeeAsmnt17::getSalary)));
		Set<Entry<String,Double>> entrySet1=avgSalaryOfDepartment.entrySet();
		for(Entry<String,Double> entry:entrySet1)
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("------------------------------------");
		System.out.println("Number og Employee in each department");
		Map<String,Long>noOfEmployee=list.stream().collect(Collectors.groupingBy(EmployeeAsmnt17::getDepartment,Collectors.counting()));
		System.out.println(noOfEmployee);
		
	}

}
