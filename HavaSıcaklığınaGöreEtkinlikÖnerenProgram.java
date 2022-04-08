package patikaJava;

import java.util.Scanner;
public class HavaSýcaklýðýnaGöreEtkinlikÖnerenProgram {
	
	public static void main(String[] args) {

		double heat;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hava kac derece? : ");
		heat = input.nextDouble();

        if (heat<5){
            System.out.println("Kayak");
        }else if (heat > 5 && heat <15 ){
            System.out.println("Sinema");
        }else if(heat > 15 && heat < 25){
            System.out.println("Piknik");
        }else if (heat > 25){
            System.out.println("Yüzme");
        }
		
	}
}
