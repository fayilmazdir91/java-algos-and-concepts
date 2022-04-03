package patikaJava;
import java.util.Scanner;
public class VücutKitleEndeksiHesaplama {
	public static void main(String[] args) {
		double kg, m;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		double vke = kg/(m*m); 
		System.out.println("Vücut Kitle Ýndeksiniz : " + vke);
	}
}
