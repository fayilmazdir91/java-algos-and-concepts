package patikaJava;
import java.util.Scanner;
public class DeseneGöreMetotOluþturma {
	
	static boolean desen(int n) {
		Scanner scan = new Scanner(System.in);
		System.out.print("N Sayisi : ");
		n = scan.nextInt();
		int n1 = n;
		System.out.print("Ciktisi : ");
		System.out.print(n+" ");
		do {
			n-=5;
			System.out.print(n+" ");
		}while (n>0);		
		while(n!=n1) {
			n+=5;
			System.out.print(n+" ");
		}
		System.out.println();
		return true;
	}
	
	
	public static void main(String[] args) {
		do {
			desen(0);
		}while(true);
	}
}
