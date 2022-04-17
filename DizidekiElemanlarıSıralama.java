package patikaJava;
import java.util.Arrays;
import java.util.Scanner;
public class DizidekiElemanlarýSýralama {
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Dizinin boyutu n : ");
		n = scan.nextInt();
		int[] dizi = new int[n];
		System.out.println("Dizinin elemanlarini giriniz : ");
		for(int i = 0; i<n; i++) {			
			System.out.print((i+1)+". Elemani : ");
			dizi[i] = scan.nextInt();
		}
		Arrays.sort(dizi);
		System.out.print("Siralama : " + Arrays.toString(dizi));
	}
}
