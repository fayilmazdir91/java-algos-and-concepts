package patikaJava;
import java.util.Scanner;
public class BasitHesapMakinesi {
	public static void main(String[] args) {
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		System.out.println("�lk sayiyi giriniz : ");
		n1 = input.nextInt();
		System.out.println("�kinci sayiyi giriniz : ");
		n2 = input.nextInt();
		
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme");
		System.out.println("Se�iniz : ");
		select = input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("Toplam : " + (n1+n2));
			break;
			
		case 2:
			System.out.println("Fark : " + (n1-n2));
			break;
		case 3:
			System.out.println("Carpim : " + (n1*n2));
			break;
			
		case 4:
			if(n2 != 0) {
				System.out.println("Bolum : " + (n1/n2));
				break;
			}
			else {
				System.out.println("Bir sayi 0'a bolunemez !");
			}
		default: 
			System.out.println("Lutfen gecerli bir deger giriniz.");
			break;
		}
	}
}
