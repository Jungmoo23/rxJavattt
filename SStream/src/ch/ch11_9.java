package ch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.*;

public class ch11_9 {

	//IntStream
	//LongStream
	//DoubleStream
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("The Alchemist","Paulo Coelho","Adventure",4.408789797));
		books.add(new Book("The Notebook","Nicholas Sparks","Romance",4.10));
		books.add(new Book("Horror Cocktail","Robert bloch","Horror",2.67));
		books.add(new Book("House of Leaves"," Mark Z. Danielwski","Horror",4.10908909));
		
		
		OptionalDouble average =books.stream()
		.mapToDouble(e -> e.getRating())
		.average();
		
		System.out.println(average.getAsDouble());
		
		// map: objects Inteager -> int
		
		// mapTodobule : primity double Double -> double
		
		// To avoid cost of boxing and unboxing
		
		IntStream intS = IntStream.of(1,3,5,8);
		DoubleStream doubleS = DoubleStream.of(1,3,5,8);
		LongStream longS = LongStream.of(1L,3L,5L,8L);
		
		Stream<Integer> boxedInts = intS.boxed();
		
		doubleS.mapToObj(val -> val);
		
	}

}
