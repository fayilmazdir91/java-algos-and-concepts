package patikaJava;
import java.util.Scanner;
public class Kombinasyon {
	public static void main(String[] args) {
		int n, r, nfak = 1, rfak = 1, nrfak = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Eleman Sayisi : ");
		n = scan.nextInt();
		System.out.println("Kac farkli grup ? ");
		r = scan.nextInt();
		/* C(n,r) = n! / (r! * (n-r)!) */
		for(int i = 1; i<=n; i++) {
			nfak = nfak * i;
		}
		for(int j = 1; j<=r; j++) {
			rfak = rfak * j;
		}
		for(int i = 1; i<=(n-r); i++) {
			nrfak = nrfak * i;
		}
		System.out.println(n + " elemanli bir kümenin elemanlari ile olusturulacak"+ r +" elemanli farkli gruplarin sayisi : ");
		System.out.println(nfak/ (rfak * nrfak));
	}
}
