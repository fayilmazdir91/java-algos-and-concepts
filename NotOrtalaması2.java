package patikaJava;
import java.util.Scanner;

public class NotOrtalamasý2 {
	public static void main(String[] args) {
		int Matematik, Fizik, Kimya, Turkce, Muzik;
		double Ortalama;
		int DersNotu = 0;
		int DersSayisi = 0;
		Scanner Ogrenci = new Scanner(System.in);
		
		System.out.println("Matematik dersi notu: ");
		Matematik = Ogrenci.nextInt();

		System.out.println("Fizik dersi notu: ");
		Fizik = Ogrenci.nextInt();
		
		System.out.println("Kimya dersi notu: ");
		Kimya = Ogrenci.nextInt();
		
		System.out.println("Türkçe dersi notu: ");
		Turkce = Ogrenci.nextInt();
		
		System.out.println("Müzik dersi notu: ");
		Muzik = Ogrenci.nextInt();
		
		if ( (Matematik <= 100 && Matematik >= 0)) {
			DersNotu+=Matematik;
			DersSayisi++;
		}
		if ((Fizik <= 100 && Fizik >= 0)) {
			DersNotu+=Fizik;
			DersSayisi++;
		}
		if ((Kimya <= 100 && Kimya >= 0)) {
			DersNotu+=Kimya;
			DersSayisi++;
		}
		if ((Turkce <= 100 && Turkce >= 0)) {
			DersNotu+=Turkce;
			DersSayisi++;
		}
		if ((Muzik <= 100 && Muzik >= 0)) {
			DersNotu+=Muzik;
			DersSayisi++;
		}
		if (DersSayisi==0) {
			DersSayisi=1;
		}
		Ortalama = DersNotu/DersSayisi;
		System.out.println("Not Ortalamasý: " + Ortalama);
		System.out.println(Ortalama>=55 ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");
		
	}
}
