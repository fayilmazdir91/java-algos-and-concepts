package patikaJava;
import java.util.Scanner;
public class Y�ld�z��gen {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.println("Deger giriniz : ");
		n = scan.nextInt();
		for(int i = 0; i<=n; i++) {
			
			for(int k=0; k<(n-i); k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j<2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = (n-1); i > 0; i--){
			for(int k=0; k<(n-i); k++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j<2*i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
        }
	}
}
