package patikaJava;
import java.util.Scanner;

public class BurçBulanProgram {
	public static void main(String[] args) {
		int month, day;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dogdugunuz ay : ");
		month = input.nextInt();
		if(month>12 || month<1) {
			System.out.println("Lutfen gecerli bir ay giriniz.");
		}
		else {
			System.out.println("Dogdugunuz Gun : ");
			day = input.nextInt();
			if (day>31 || day<1) {
				System.out.println("Lutfen gecerli bir gun giriniz.");
			}
			else {
				if ((day>=21 && month == 3) || (day<=20 && month == 4)) {
					System.out.println("Koc burcusunuz.");
				}
				if ((day>=21 && month == 4) || (day<=21 && month == 5)) {
					System.out.println("Boga burcusunuz.");
				}
				if ((day>=22 && month == 5) || (day<=22 && month == 6)) {
					System.out.println("Ikizler burcusunuz.");
				}
				if ((day>=23 && month == 6) || (day<=22 && month == 7)) {
					System.out.println("Yengec burcusunuz.");
				}
				if ((day>=23 && month == 7) || (day<=22 && month == 8)) {
					System.out.println("Aslan burcusunuz.");
				}
				if ((day>=23 && month == 8) || (day<=22 && month == 9)) {
					System.out.println("Basak burcusunuz.");
				}
				if ((day>=23 && month == 9) || (day<=22 && month == 10)) {
					System.out.println("Terazi burcusunuz.");
				}
				if ((day>=23 && month == 10) || (day<=21 && month == 11)) {
					System.out.println("Akrep burcusunuz.");
				}
				if ((day>=22 && month == 11) || (day<=21 && month == 12)) {
					System.out.println("Yay burcusunuz.");
				}
				if ((day>=22 && month == 12) || (day<=21 && month == 1)) {
					System.out.println("Oglak burcusunuz.");
				}
				if ((day>=22 && month == 1) || (day<=19 && month == 2)) {
					System.out.println("Kova burcusunuz.");
				}
				if ((day>=20 && month == 2) || (day<=20 && month == 3)) {
					System.out.println("Balik burcusunuz.");
				}
			}
		}
	}
}
