package patikaJava;
import java.util.Scanner;

public class D�rtveBe�inKuvvetleri {
	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("Sayiyi giriniz : ");
		a = input.nextInt();
		System.out.println("4'�n kuvvetleri : ");
		for(int i=1;i<=a;i*=4) {
			System.out.println(i);
		}
		System.out.println("5'in kuvvetleri : ");
		for(int j=1;j<=a;j*=5) {
			System.out.println(j);
		}
	}
}
