package patikaJava;
import java.util.Scanner;
public class ÇinZodyaðý {
	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dogum Yilinizi Giriniz : ");
		year = input.nextInt();
		
		if(year%12 == 0) {
			System.out.println("Cin Zodyagý Burcunuz : Maymun");
		}else if(year%12 == 1) {
			System.out.println("Cin Zodyagý Burcunuz : Horoz");
		}else if(year%12 == 2) {
			System.out.println("Cin Zodyagý Burcunuz : Kopek");
		}else if(year%12 == 3) {
			System.out.println("Cin Zodyagý Burcunuz : Domuz");
		}else if(year%12 == 4) {
			System.out.println("Cin Zodyagý Burcunuz : Fare");
		}else if(year%12 == 5) {
			System.out.println("Cin Zodyagý Burcunuz : Okuz");
		}else if(year%12 == 6) {
			System.out.println("Cin Zodyagý Burcunuz : Kaplan");
		}else if(year%12 == 7) {
			System.out.println("Cin Zodyagý Burcunuz : Tavsan");
		}else if(year%12 == 8) {
			System.out.println("Cin Zodyagý Burcunuz : Ejderha");
		}else if(year%12 == 9) {
			System.out.println("Cin Zodyagý Burcunuz : Yilan");
		}else if(year%12 == 10) {
			System.out.println("Cin Zodyagý Burcunuz : At");
		}else if(year%12 == 11) {
			System.out.println("Cin Zodyagý Burcunuz : Koyun");
		}
	}
	
}
