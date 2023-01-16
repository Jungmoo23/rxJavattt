package ch;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ex11_12 {

	public static void main(String[] args) {
		// 무한 스트림
		//Stream.iterate(0, i -> i+1);
//		
//		IntStream.iterate(0, i -> i-1)
//		.limit(15)
//		.forEach(System.out::println);
		
		Stream.generate(() ->"Hello")
		.forEach(System.out::println);
		
		
		

	}

}
