package ch;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ch11_1 {

		/*
		 * 스트림
		 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<Book> books = new ArrayList<>();
		
		List<Book> popularHorrorBooks = new ArrayList<>();
		
		for(Book book : books) {
			// db 내용과 비슷 함 select name From books where genre = 'horror' AND rating >3
			if(book.getGenre().equalsIgnoreCase("Horror") && book.getRating() >3) {
				
				popularHorrorBooks.add(book);
				
			}
		}
		
		// declarative
		// Flexible
		// Parallelizable
		
		//after java 8
		
		books.stream().parallel()
		.filter(e -> e.getGenre().equalsIgnoreCase("Horror"))
		.filter(e -> e.getRating()>3)
		.collect(Collectors.toList())
		.forEach(e -> System.out.println(e));
		
		
		
		
	}

}
