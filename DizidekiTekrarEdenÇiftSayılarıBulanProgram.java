package patikaJava;
import java.util.Arrays;

public class DizidekiTekrarEdenÇiftSayılarıBulanProgram {

	static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i == value) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] list = {3, 2, 2, 4, 4, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for(int i = 1; i < list.length; i++) {
			for(int j = 1; j < list.length; j++) {
				if((i != j) && (list[i] == list[j])) {
					if(!isFind(duplicate, list[i])) {
						duplicate[startIndex++] = list[i];						
					}
					break;
				}
			}
		}
		
		for(int value : duplicate) {
			if(value != 0) {
				if(value%2==0) {
					System.out.println(value);					
				}
			}
		}
	}
}
