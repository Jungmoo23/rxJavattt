package ch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch11_8 {

	//Streams are lazy
	// 스트림에 터미널 작업을 적용할 때 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
		books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
		books.add(new Book("Horror Cocktail","Robert bloch","Horror",2.67));
		books.add(new Book("House of Leaves"," Mark Z. Danielwski","Horror",4.10908909));
			
			
		Stream<Book> stream = books.stream().parallel() // source
			.filter(e -> e.getGenre().equalsIgnoreCase("Horror")) // Intermediate Op
			.peek(e -> System.out.println("Filterd Book "+e))
			.filter(e -> e.getRating()>3); // Intermediate Op
			//.collect(Collectors.toList()); //Terminal
		
		System.out.println("Filter Done");
		
		collect(stream);
		

	}

	private static void collect(Stream<Book> stream) {
		List<Book> list =  stream.collect(Collectors.toList());
		System.out.println("Collection Done");
		list.forEach(System.out::println);
		
		
		
	}

}
