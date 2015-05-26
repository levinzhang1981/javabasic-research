package com.levinzhang.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("TaoBao");
		names.add("ZhiFuBao");
//		List<String> lowercaseNames = new ArrayList<>();
//		for (String name : names) {
//		  lowercaseNames.add(name.toLowerCase());
//		}
		
		List<String> lowercaseNames = 
				names.stream().map((name) -> {return name.toLowerCase();}).collect(Collectors.toList());

		System.out.println(lowercaseNames.size());
	}
}
