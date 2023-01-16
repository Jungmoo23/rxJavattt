package ch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch11_6 {
	// map
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.of(1,2,3,4,5,6,7,8,9,10)
		.map(e -> e*5)
		.forEach(e -> System.out.println(e));
		
		
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
		books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
		books.add(new Book("Horror Cocktail","Robert bloch","Horror",2.67));
		books.add(new Book("House of Leaves"," Mark Z. Danielwski","Horror",4.10908909));
			
			
		/*List<S> poopularHorrorBooks=*/  books.stream().parallel() // source
			.filter(e -> e.getGenre().equalsIgnoreCase("Horror")) // Intermediate Op
			.filter(e -> e.getRating()>3) // Intermediate Op
			.map(e -> e.getName())
			.forEach(e -> System.out.println(e));
			//.collect(Collectors.toList()); //Terminal
	}

}
