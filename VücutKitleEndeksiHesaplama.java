package patikaJava;
import java.util.Scanner;
public class V�cutKitleEndeksiHesaplama {
	public static void main(String[] args) {
		double kg, m;
		
		Scanner input = new Scanner(System.in);
		System.out.println("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		m = input.nextDouble();
		System.out.println("L�tfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		double vke = kg/(m*m); 
		System.out.println("V�cut Kitle �ndeksiniz : " + vke);
	}
}
