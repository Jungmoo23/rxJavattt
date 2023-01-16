package ch;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ch11_2  /*ch11_3도 포*/{
	
	/*
	 * 1. 작업을 독립적으로 스트리밍하여 작
	 * 
	 * */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
		
		
		//이러한 방식 스트림 방식으로 부름
		//1 .source . 배열 생성 및 io channer 만듦 
		//2 .0개 이상의 작업을 함 스트림을 다른 스트림으로 만듦
		
		books.stream().parallel() // source
		.filter(e -> e.getGenre().equalsIgnoreCase("Horror")) // Intermediate Op
		.filter(e -> e.getRating()>3) // Intermediate Op
		.collect(Collectors.toList()); //Terminal
		
				
		//1. source
		Stream<Book> stream = books.stream();
		
		//2.Intermediate Op
		Stream<Book> horrorBooks=stream.filter(e -> e.getGenre().equalsIgnoreCase("Horror"));
		
		
		//3.Intermediate Op
		Stream<Book> pHorrorBooks= horrorBooks.filter(e -> e.getRating()>3);
		
		//4. Terminal
		List<Book> collect = pHorrorBooks.collect(Collectors.toList());
		

	}

}
