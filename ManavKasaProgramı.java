package patikaJava;
import java.util.Scanner;
public class ManavKasaProgram� {
	public static void main(String[] args) {
		double armut, elma, domates, muz, patlican;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut ka� kilo(2,14 TL) ?");
		armut = input.nextDouble();

		System.out.println("Elma ka� kilo(3,67 TL) ?");
		elma = input.nextDouble();
		 
		System.out.println("Domates ka� kilo(1,11 TL) ?");
		domates = input.nextDouble();

		System.out.println("Muz ka� kilo(0,95 TL) ?");
		muz = input.nextDouble();

		System.out.println("Patl�can ka� kilo(5,00 TL) ?");
		patlican = input.nextDouble();
		
		double toplam = (armut*(2.14)) + (elma*(3.67))+(domates*(1.11))+(muz*(0.95))+(patlican*(5.00));
		System.out.println("Toplam tutar : " + toplam + " TL");
	}
}
