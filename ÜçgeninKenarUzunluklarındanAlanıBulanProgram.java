package patikaJava;

import java.util.Scanner;

public class ÜçgeninKenarUzunluklarýndanAlanýBulanProgram {
	public static void main(String[] args) {
		int a, b, c;
		Scanner deger = new Scanner(System.in);
		
		System.out.println("A Kenarý: ");
		a = deger.nextInt();
		
		System.out.println("B Kenarý: ");
		b = deger.nextInt();
		
		System.out.println("C Kenarý: ");
		c = deger.nextInt();
		
		double u = (a+b+c)/2;
		
		double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Ucgenin Alani : " + Alan);
	}
}
