package patikaJava;
import java.util.Scanner;

public class KdvTutarýHesaplayanProgram {
	public static void main(String[] args) {
		Scanner Giris = new Scanner(System.in);
		double Tutar;
		
		System.out.println("Tutar: ");
		Tutar = Giris.nextDouble();
		if(Tutar>0) {
			System.out.println("KDV'siz Fiyat: " + Tutar);
			double Kdv = Tutar<1000 ? Tutar*18/100 : Tutar*8/100;
			System.out.println("KDV'li Fiyat: " + (Tutar + Kdv));
			System.out.println("KDV tutarý: " + Kdv);
		}else {
			System.out.println("Lütfen geçerli bir tutar giriniz.");
		}
	}
}