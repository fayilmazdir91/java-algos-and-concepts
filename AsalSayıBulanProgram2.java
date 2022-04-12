package patikaJava;
import java.util.Scanner;
public class AsalSayýBulanProgram2 {
	
	static boolean asal(int a) {
		int sayac = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayi Giriniz : ");
		a = scan.nextInt();
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				sayac++;
			}
			
		}
		if(a==1) {
			System.out.println(a + " sayisi ASAL degildir !");
		}else {
			if(sayac==0) {
				System.out.println(a + " sayisi ASALDIR !");
			}else {
				System.out.println(a + " sayisi ASAL degildir !");
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		do {
			asal(0);
		}while(true);
	}
}
