package patikaJava;
import java.util.Scanner;
public class ManavKasaProgramý {
	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo(2,14 TL) ?");
		armut = input.nextDouble();

		System.out.println("Elma kaç kilo(3,67 TL) ?");
		elma = input.nextDouble();
		 
		System.out.println("Domates kaç kilo(1,11 TL) ?");
		domates = input.nextDouble();

		System.out.println("Muz kaç kilo(0,95 TL) ?");
		muz = input.nextDouble();

		System.out.println("Patlýcan kaç kilo(5,00 TL) ?");
		patlican = input.nextDouble();
		
		double toplam = (armut*(2.14)) + (elma*(3.67))+(domates*(1.11))+(muz*(0.95))+(patlican*(5.00));
		System.out.println("Toplam tutar : " + toplam + " TL");
	}
}
