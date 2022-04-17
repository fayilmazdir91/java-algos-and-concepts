package patikaJava;
import java.util.Arrays;
public class DizidekiElemanlarýnFrekansý {
	public static void main(String[] args) {
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		Arrays.sort(dizi);
		System.out.println("Tekrar Sayilari");
	
		for(int i = 0; i < dizi.length; i++) {
			int sayac = 0;
			for(int j = 0; j < dizi.length; j++) {
				if(dizi[i] == dizi[j]) {
					sayac++;	
				}	
			}
			System.out.println(dizi[i] + " sayisi " + sayac + " kere tekrar edildi.");
			i += sayac-1;
		}
		
	}
}
