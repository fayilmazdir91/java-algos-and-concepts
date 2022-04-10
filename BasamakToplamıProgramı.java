package patikaJava;
import java.util.Scanner;
public class BasamakToplamýProgramý {
	public static void main(String[] args) {
		int sayi, toplam = 0, gecicisayi, b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		sayi = scan.nextInt();
		toplam = sayi%10;
		
		do {
			sayi = sayi/10;
			gecicisayi = sayi%10;
			toplam += gecicisayi;
			
		}
		while(sayi/10 != 0);
			 
		System.out.println(toplam);
					
		
	}
}
