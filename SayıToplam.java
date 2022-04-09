package patikaJava;
import java.util.Scanner;
public class SayýToplam {
	public static void main(String[] args) {
		int k, l = 0, toplam = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayi Giriniz : ");
		k = input.nextInt();
		
		for(int i=1; i<=k;i++) {
			if(i%3==0 && i%4==0) {
				l++; toplam += i;
			}
		}
		
		double ort = toplam/l; 
		System.out.println("0'dan girdiginiz sayiya kadar olan,\n3'e ve 4'e kalansiz bolunen sayilarin ortalamasi : " + ort);
	}
}
