package patikaJava;
import java.util.Scanner;

public class TaksimetreProgram� {
 public static void main(String[] args) {
	double km, tutar;
	Scanner mesafe = new Scanner(System.in);
	
	System.out.println("Ka� km mesafe gidildi?");
	km = mesafe.nextDouble();
	
	tutar = km*2.20 + 10;
	System.out.println(tutar>20?"Tutar: " + tutar + " TL":"Tutar: " + 20 + " TL");
 }
}
