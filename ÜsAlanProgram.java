package patikaJava;
import java.util.Scanner;
public class ÜsAlanProgram {

	static boolean us(int a, int b) {
		int sonuc = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Taban degeri giriniz : ");
		a = scan.nextInt();
		System.out.println("Us degerini giriniz : ");
		b = scan.nextInt();
		if(b==0) {
			sonuc = 1;
		}else if(b<0) {
			System.out.println("Hatali deger girdiniz.");
		}
		else{
			for(int i = 1; i<=b;i++) {
				sonuc*=a;
			}
		}
		System.out.println("Sonuc : "+ sonuc);
		return true;
	}
	
	public static void main(String[] args) {
		do {
			us(0, 0); 
		}while (true);
			
		
	}
}
