package patikaJava;
import java.util.Scanner;
public class �inZodya�� {
	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dogum Yilinizi Giriniz : ");
		year = input.nextInt();
		
		if(year%12 == 0) {
			System.out.println("Cin Zodyag� Burcunuz : Maymun");
		}else if(year%12 == 1) {
			System.out.println("Cin Zodyag� Burcunuz : Horoz");
		}else if(year%12 == 2) {
			System.out.println("Cin Zodyag� Burcunuz : Kopek");
		}else if(year%12 == 3) {
			System.out.println("Cin Zodyag� Burcunuz : Domuz");
		}else if(year%12 == 4) {
			System.out.println("Cin Zodyag� Burcunuz : Fare");
		}else if(year%12 == 5) {
			System.out.println("Cin Zodyag� Burcunuz : Okuz");
		}else if(year%12 == 6) {
			System.out.println("Cin Zodyag� Burcunuz : Kaplan");
		}else if(year%12 == 7) {
			System.out.println("Cin Zodyag� Burcunuz : Tavsan");
		}else if(year%12 == 8) {
			System.out.println("Cin Zodyag� Burcunuz : Ejderha");
		}else if(year%12 == 9) {
			System.out.println("Cin Zodyag� Burcunuz : Yilan");
		}else if(year%12 == 10) {
			System.out.println("Cin Zodyag� Burcunuz : At");
		}else if(year%12 == 11) {
			System.out.println("Cin Zodyag� Burcunuz : Koyun");
		}
	}
	
}
