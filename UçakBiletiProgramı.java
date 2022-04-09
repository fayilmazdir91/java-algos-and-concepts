package patikaJava;
import java.util.Scanner;
public class UçakBiletiProgramý {
	public static void main(String[] args) {
		double km, tutar;
		int age, type;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kac km mesafe gidilecek ? ");
		km = input.nextDouble();
		if(km<=0) {
			System.out.println("Hatali veri girdiniz.");
		}
		else {
			System.out.println("Kac yasindasiniz ? ");
			age = input.nextInt();
			if(age<=0) {
				System.out.println("Hatali veri girdiniz.");
			}
			else {
				System.out.println("Yolculuk tipi nedir ?\nTek Yon icin 1'e basiniz.\nGidis-Donus icin 2'ye basiniz.");
				type = input.nextInt();
				if(type == 1) {
					if(age<12) {

						tutar = (0.10 * km * type)/2;
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}else if(age>=12 && age<=24) {

						tutar = (0.10 * km * type)*(0.9);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
						
					}else if (age>65) {

						tutar = (0.10 * km * type)*(0.7);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}else {

						tutar = 0.10 * km * type;
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}
				}else if(type == 2) {
					if(age<12) {

						tutar = (0.10 * km * type)*(0.5)*(0.8);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}else if(age>=12 && age<=24) {

						tutar = (0.10 * km * type)*(0.9)*(0.8);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
						
					}else if (age>65) {

						tutar = (0.10 * km * type)*(0.7)*(0.8);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}else {

						tutar = (0.10 * km * type)*(0.8);
						System.out.println("Toplam tutariniz : " + tutar + " TL");
					}
				}else {
					System.out.println("Hatali veri girdiniz.");
				}
						 
				
			}	
		}			
	}
}
