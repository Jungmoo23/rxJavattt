package ch;

import java.util.*;

public class ch11_14 {

	//스트림은 순차적 혹은 병렬로 처리하는 방식이 있음.
	/*
	 * 순서 .stream()
	 * 병렬 .parallelStream() || .parallel()
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Long startTime,endTime;

		List<Empoyee> list = new ArrayList<>();
		
		for(int i = 0; i<100; i++) {
		
			list.add(new Empoyee("John", 20000));
			list.add(new Empoyee("Rohn", 3000));
			list.add(new Empoyee("Tom", 15000));
			list.add(new Empoyee("Bheem", 8000));
			list.add(new Empoyee("Shiva", 200));
			list.add(new Empoyee("Krishba", 50000));
		}
		
		startTime = System.currentTimeMillis();
		System.out.println("Performing Sequentially:: "+list.stream()
		.filter(e-> e.getSalary()>1000)
		.count()
				);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken with Sequential : "+(endTime-startTime) );
		
		startTime = System.currentTimeMillis();
		System.out.println("Performing Sequentially:: "+list.parallelStream()
		.filter(e-> e.getSalary()>1000)
		.count()
				);
		endTime = System.currentTimeMillis();
		System.out.println("Time taken with Sequential : "+(endTime-startTime) );
		
		
		
		
		
		
		
		
		
		
	}

}
