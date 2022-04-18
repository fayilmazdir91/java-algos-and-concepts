package patikaJava;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessProgram {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(10);
		
		Scanner input = new Scanner(System.in);
		int right = 0;
		int selected;
		int[] wrong = new int[3];
		boolean isWin = false;
		boolean isWrong = false;
		
		System.out.println(number);
		while(right < 3) {
			System.out.println("Lutfen tahmininizi giriniz : ");
			selected = input.nextInt();
			
			if(selected < 0 || selected > 10) {				
				System.out.println("Lutfen 0-10 arasýnda deger giriniz.");
				
				if(isWrong) {
					right++;
					System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (3-right));
				}else {
					isWrong = true;
					System.out.println("Bir daha hatali girisinizde hakkinizdan düsülecektir.");
				}
				continue;
			}
			
			if(selected == number) {
				System.out.println("Tebrikler, dogru tahmin ! Tahmin ettiginiz sayi : " + number);
				isWin = true;
				break;
			}
			else {
				System.out.println("Hatali bir sayi girdiniz !");
				if(selected > number) {
					System.out.println(selected + " sayisi, gizli sayidan büyüktür.");
				} else {
					System.out.println(selected + " sayisi, gizli sayidan kücüktür.");
				}
				
				wrong[right++] = selected;
				System.out.println("Kalan hakki : " + (3 - right));
			}
		}
		
		if(!isWin) {
			System.out.println("Kaybettiniz ! ");
			
			System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
			
		}
	}
}
