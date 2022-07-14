package com.yash.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ItemDriver16 {
	public static void main(String[] args)
	{
		List<ItemAsmnt16> ilist=new ArrayList<ItemAsmnt16>();
		
		ilist.add(new ItemAsmnt16(1,"bag","travel",5000,"22/10/2024","22/10/2026"));
		ilist.add(new ItemAsmnt16(2,"pendrive","electronics",2000,"10/01/2022","26/10/2029"));
		ilist.add(new ItemAsmnt16(3,"pen","study",500,"2/10/2022","11/5/2027"));
		ilist.add(new ItemAsmnt16(4,"notbook","study",300,"10/04/2024","16/09/2029"));
		ilist.add(new ItemAsmnt16(5,"table","furniture",8000,"25/10/2023","23/10/2026"));
		ilist.add(new ItemAsmnt16(6,"keybord","electronics",1500,"08/10/2022","23/10/2025"));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter category name :");
		String category=sc.next();
		List<ItemAsmnt16> i=ilist.stream().filter(e->e.categoryName.contains(category)).collect(Collectors.toList());
		i.stream().forEach(System.out::println);
		
		System.out.println("Enter date of manufacturing :");
		String dom=sc.next();

		System.out.println("Enter date of expiring :");
		String doe=sc.next();
		
		
		List<ItemAsmnt16> date1=ilist.stream().filter(e->e.dateOfExpiring.contains(doe)&&e.dateOfManufacturing.contains(dom)).collect(Collectors.toList());
		date1.stream().forEach(System.out::println);
		
		System.out.println("Enter min price :");
		int minPrice=sc.nextInt();
		
		System.out.println("Enter max price :");
		int maxPrice=sc.nextInt();
		
		List<ItemAsmnt16> price=ilist.stream().filter(e->e.price >minPrice && e.price<maxPrice).collect(Collectors.toList());
		price.stream().forEach(System.out::println);
		

	}

} 
