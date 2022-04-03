package patikaJava;
import java.util.Scanner;

public class DaireAlanýBulanProgram {
	public static void main(String[] args) {
	
		int r;
		int a;
		double pi = 3.14;
		double alan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yari Cap : ");
		r = input.nextInt();
		System.out.println("Merkez acisinin olcusu : ");
		a = input.nextInt();
		
		alan = (pi * (r*r) * a) / 360;

		System.out.println("Daire'nin Alani : " + alan);
	}
}
