package patikaJava;
import java.util.Scanner;
public class MükemmelSayýBulanProgram {
	public static void main(String[] args) {
		int a, b, toplam = 0;
		Scanner input = new Scanner(System.in);
		// 28 = 14+7+4+2+1
		
		System.out.println("Bir sayi giriniz: ");
		a = input.nextInt();
		if(a<=0) {
			System.out.println("Sadece pozitif degerler mukemmel sayi olabilir.");
			
		}else {
			for(b=1;b<a;b++) {
				if(a%b==0) {
					toplam += b;  
				}
			}
			
			if(toplam==a) {
				System.out.println(a+ " Mukemmel sayidir.");
			}else {
				System.out.println(a+ " Mukemmel sayi degildir.");
			}
		
		}
	}
	
}
