package patikaJava;
import java.util.Scanner;
public class ÜslüSayiProgramý {
	public static void main(String[] args) {
		int n, us, sonuc= 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayiyi giriniz : ");
		n = scan.nextInt();
		System.out.println("Ussu giriniz : ");
		us = scan.nextInt();
		for(int i=1; i<=us; i++) {
			sonuc *= n; 
		}
		
		System.out.println(n+" sayisinin "+us+" ussunden degeri : ");
		System.out.println(sonuc);
	}
}
