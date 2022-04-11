package patikaJava;
import java.util.Scanner;
public class TersUcgen {
	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak Sayisi: ");
		n = input.nextInt();
		
		for(int i = 1; i<=n; i++) {
			for(int k = 1; k<i; k++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j<2*(n-i+2)-2; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
