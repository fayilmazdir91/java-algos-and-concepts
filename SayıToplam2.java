package patikaJava;
import java.util.Scanner;
public class SayýToplam2 {
	public static void main(String[] args) {
		int a, toplam=0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Sayi Giriniz : ");
			a = input.nextInt();
			if (a%2==0 && a%4==0) {
				toplam += a;
			}
			
		} while (a%2==0);
		System.out.println("Toplam : "+toplam);
	}	
}
