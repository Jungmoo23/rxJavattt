package ch;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch11_5 {
	// 필터 메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Higher Order Functions
		/*
		 * 1. Filter
		 * 2. Map
		 * 3. Reduce
		 * */
		
		Stream.of(34,678,89,4,52,31,325)
		.filter(e ->e %2 ==0)
		.forEach(e -> System.out.println(e));
		
		
		
		
	}

}
