package ch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ch11_4 {
	
	// 한번 사용한 스트림은 재 사용이 불가하여 다시 만들어야 한다 ㅆ2ㅂ
	
	

	public static void main(String[] args) {
	List<Book> books = new ArrayList<>();
	
	books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
	books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
	books.add(new Book("Horror Cocktail","Robert bloch","Horror",2.67));
	books.add(new Book("House of Leaves"," Mark Z. Danielwski","Horror",4.10908909));
		
		
	List<Book> poopularHorrorBooks = books.stream().parallel() // source
		.filter(e -> e.getGenre().equalsIgnoreCase("Horror")) // Intermediate Op
		.filter(e -> e.getRating()>3) // Intermediate Op
		.collect(Collectors.toList()); //Terminal

	poopularHorrorBooks.forEach(e  -> System.out.println(e));
	
	
	List<Book> poopularRomanceBooks = books.stream().parallel() // source
			.filter(e -> e.getGenre().equalsIgnoreCase("Romance")) // Intermediate Op
			.filter(e -> e.getRating()>3) // Intermediate Op
			.collect(Collectors.toList()); //Terminal
	poopularRomanceBooks.forEach(e  -> System.out.println(e));
	
	}

}
