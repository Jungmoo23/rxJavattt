package ch;

import java.util.stream.Stream;

public class ex11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int cnt = 0;
		
		Stream<String> a = Stream.of("Hello","there! ");
		//a.forEach(System.out::println);
		
		Stream<String> b = Stream.of("Learing","Java? ");
		Stream<String> c = Stream.of("Learing!!!","Java???? ");
		
		//b.forEach(System.out::println);
		Stream<Stream<String>> of = Stream.of(a,b,c);
		
		of.forEach(System.out::println);
		
		 Stream.of(a,b,c)
		     
			.flatMap(e -> e)
			//.filter(cnt -> cnt% 2 ==0)
			.forEach(e -> System.out.printf("[ "+e+" ] "));
		

	}

}
