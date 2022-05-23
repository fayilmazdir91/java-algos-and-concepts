package raceOfThreads;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace extends Thread	{
	
	private List<Integer> evens = new ArrayList<>();
	private List<Integer> odds = new ArrayList<>();
	
	List<Integer> subArray;
	int number;
	
	public ThreadRace(List<Integer> subArray) {
		this.subArray = subArray;
	}
	
	@Override
	public void run() {
		Even_Or_Odd(this.subArray);
		print();
	}

	private void print() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" even numbers -> "+evens);
		System.out.println(Thread.currentThread().getName()+" odd numbers -> "+odds);
	}

	public synchronized void Even_Or_Odd(List<Integer> subArray) {
		// TODO Auto-generated method stub
		int capacity = subArray.size();
		
		for(int i=0; i<capacity;i++) {
			number = subArray.get(i);
			if(number%2 == 0) {
				evens.add(number);
			}else {
				odds.add(number);
			}
		}
	}
}
