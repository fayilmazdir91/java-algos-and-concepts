package patikaJava;
import java.util.Scanner;
public class NotOrtalamas� {
	public static void main(String[] args) {
		int Matematik, Fizik, Kimya, Turkce, Tarih, Muzik;
		Scanner Ogrenci = new Scanner(System.in);
		
		System.out.println("Matematik dersi notu: ");
		Matematik = Ogrenci.nextInt();

		System.out.println("Fizik dersi notu: ");
		Fizik = Ogrenci.nextInt();
		
		System.out.println("Kimya dersi notu: ");
		Kimya = Ogrenci.nextInt();
		
		System.out.println("T�rk�e dersi notu: ");
		Turkce = Ogrenci.nextInt();
		
		System.out.println("Tarih dersi notu: ");
		Tarih = Ogrenci.nextInt();
		
		System.out.println("M�zik dersi notu: ");
		Muzik = Ogrenci.nextInt();
		
		double Ortalama = (Matematik + Fizik + Kimya + Turkce + Tarih + Muzik)/6;
		System.out.println("Not Ortalamas�: " + Ortalama);
		System.out.println(Ortalama>=60 ? "S�n�f� Ge�ti" : "S�n�fta Kald�");
		
	}
	
}
