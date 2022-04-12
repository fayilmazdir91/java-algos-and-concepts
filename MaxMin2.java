package patikaJava;
import java.util.Scanner;
public class MaxMin2 {
	public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int n;
        Scanner scan = new Scanner(System.in);
        int min = list[0];
        int max = list[0];
        System.out.println("N sayisi : ");
        n = scan.nextInt();
        
        for(int i : list) {
        	if(i<n) {
        		if((n-i)<min) {
        			min = i;
        		}
        	}
        	if(i>n) {
        		if((i-n)<max) {
        			max = i;
        		}
        		
        	}
        }
        
        System.out.println("Girilen sayidan küçük en yakin sayi : " + min);
        System.out.println("Girilen sayidan büyük en yakin sayi :" + max);
	}
}
