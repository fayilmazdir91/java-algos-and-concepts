package patikaJava;

import java.util.Scanner;

public class ��geninKenarUzunluklar�ndanAlan�BulanProgram {
	public static void main(String[] args) {
		int a, b, c;
		Scanner deger = new Scanner(System.in);
		
		System.out.println("A Kenar�: ");
		a = deger.nextInt();
		
		System.out.println("B Kenar�: ");
		b = deger.nextInt();
		
		System.out.println("C Kenar�: ");
		c = deger.nextInt();
		
		double u = (a+b+c)/2;
		
		double Alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("Ucgenin Alani : " + Alan);
	}
}
