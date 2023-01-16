package ch;

import java.util.stream.Stream;

public class ch11_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = Stream.of(1,2,34,56,76,87,89,90)
		.reduce(0, (x,y)->x+y);
		
		//reduce
		/*
		 * 1. 0+1
		 * 2. 1+2
		 * 3.  3+34
		 * 
		 * */
		
		
		System.out.println(i);
		
		
		
	}

}
