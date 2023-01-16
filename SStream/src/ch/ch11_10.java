package ch;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;



public class ch11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. IntStream
		 * 2. DoubleStream
		 * 3. LongStream
		 * */
		
		int sum = IntStream.of(1,2,3,4).sum();
		
		System.out.println(sum);
		
		// max() Optional : primitive
		
		OptionalInt oInt=IntStream.of(1,2,3,4).max();
		System.out.println(oInt.getAsInt());
		
		// min  Optional primitive
		

		OptionalInt oInt2=IntStream.of(1,2,3,4).min();
		System.out.println(oInt2.getAsInt());
		
		//average() Optional primitive
		OptionalDouble double_s=IntStream.of(1,2,3,4).average();
		System.out.println(double_s.getAsDouble());
		
		//summaryStatistics() 최대 최소 평균
		   IntSummaryStatistics summaryStatistics =IntStream.of(1,2,3,44).summaryStatistics();
		   System.out.println(summaryStatistics);
		
		
		
	}

}
