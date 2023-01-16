package ch;

import java.util.Arrays;
import java.util.List;
import java.util.Locale.Builder;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ch11_11 {

	//bounded Streams | Finite Streams 제한 스트
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. stream() on aCollection
		List<Integer>list = List.of(1,4,7,9,4);
		Stream<Integer> streamIntStream=list.stream();
		
		//How to can stream a Map.
		Map<Integer,String> map = Map.of(1,"one",2,"two",3,"three",4,"fore");
		Stream<Entry<Integer,String>> entries = map.entrySet().stream();
		
		//2. of() Stream class
		Stream<String>streamStrings = Stream.of("Hey! ","Happy","Thanksgiving");
		
		//3. stream() of Arrays
		Integer[] integerArr = {3,5,7,89,9};
		Stream<Integer>stream = Arrays.stream(integerArr);
		
		int[] intArr = {3,5,7,89,9};
		IntStream stream2 =Arrays.stream(intArr);
		
		//4 builder() of stream class.
		java.util.stream.Stream.Builder<Integer> builder = Stream.builder();
		
		builder.add(1);
		
		//code
		
		//condition
		builder.add(4);
		builder.build();
		
		
		
		
		
	
		
		
		
	}

}
