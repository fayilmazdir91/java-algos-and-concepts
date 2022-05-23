package raceOfThreads;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int capacity = 10000;
		
		List<Integer> arrayList = new ArrayList<>(capacity);
		
		for(int i=1;i<=capacity;i++) {
			arrayList.add(i);
		}
		
		List<Integer> subList1 = arrayList.subList(0, 2500);
		List<Integer> subList2 = arrayList.subList(2500, 5000);
		List<Integer> subList3 = arrayList.subList(5000, 7500);
		List<Integer> subList4 = arrayList.subList(7500, 10000);
		
		ThreadRace threadRace1 = new ThreadRace(subList1);
		threadRace1.start();
		ThreadRace threadRace2 = new ThreadRace(subList2);
		threadRace2.start();
		ThreadRace threadRace3 = new ThreadRace(subList3);
		threadRace3.start();
		ThreadRace threadRace4 = new ThreadRace(subList4);
		threadRace4.start();
		
	}
}
