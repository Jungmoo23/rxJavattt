package ch;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class ex11_15 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		System.out.println(Runtime.getRuntime().availableProcessors());
		
		System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","2");
		
		System.out.println(ForkJoinPool.getCommonPoolParallelism());
		
		ForkJoinPool pool = new ForkJoinPool(2);
		
		List<Empoyee> list = new ArrayList<>();
		
		for(int i = 0; i<100; i++) {
			
			list.add(new Empoyee("John", 20000));
			list.add(new Empoyee("Rohn", 3000));
			list.add(new Empoyee("Tom", 15000));
			list.add(new Empoyee("Bheem", 8000));
			list.add(new Empoyee("Shiva", 200));
			list.add(new Empoyee("Krishba", 50000));
		}
		
		long count = pool.submit(
				() -> list.parallelStream()
				.filter(e -> e.getSalary() > 1000 )
				.count()).get();
		
			System.out.println(count);
	}
	
	//Computational Intensive 
	// Number of threads <= number of cores
	
	//IO intensive
	//Number of threads > Number of cores
	
	
	
	

}
