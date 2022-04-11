package patikaJava;
import java.util.Scanner;
public class MinVeMaxDeðerleriBulanProgram {
	public static void main(String[] args) {
		int n, sayi = 0, max = 0, min = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kac tane sayi gireceksiniz : ");
		n = input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i+". Sayiyi Giriniz : ");
			sayi = input.nextInt();
			
			if(sayi>max) {
				if(min == 0) {
					min = sayi;
				}
				max = sayi;
			}
			if(sayi<min) {
				if (max == 0) {
					max = sayi;
				}
				min = sayi;
			}
		}
		System.out.println("En buyuk sayi : "+ max);
		System.out.println("En kucuk sayi : "+ min);
	}
}
