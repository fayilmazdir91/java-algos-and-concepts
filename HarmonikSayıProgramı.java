package patikaJava;
import java.util.Scanner;
public class HarmonikSayýProgramý {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n; 
		double toplam = 0;
		System.out.println("Bir sayi giriniz : ");
		n = scan.nextInt();
		for(int i = 1; i<=n; i++) {
			toplam += (1.0/i);
		}
		System.out.println(toplam);
	}
}
