package patikaJava;
import java.util.Scanner;

public class HesapMakinesi2 {
	

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayý :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Sonuç : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayý :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayý gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayý :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban deðeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs deðeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayý giriniz :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç : " + result);
    }
	
	static void mod() {
		Scanner scan = new Scanner(System.in);
	    System.out.print("1. degeri giriniz :");
	    int a = scan.nextInt();
	    System.out.print("2. degeri giriniz :");
	    int b = scan.nextInt();
		 
		int result=a%b;
	    System.out.println("Mod islemi sonucu: "+result);
	}
	
	static void area() {
		 int cevre,alan; 
		 Scanner scan = new Scanner(System.in);
	     System.out.print("1. kenari giriniz :");
	     int a = scan.nextInt();
	     System.out.print("2. kenari giriniz :");
	     int b = scan.nextInt();
		 
	     cevre=2*(a+b);
	     alan=a*b;
	     System.out.println("cevre:"+cevre);
	     System.out.println("alan"+alan);
	
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		
		String menu = "1- Toplama Islemi\n"
				+ "2- Cýkarma Islemi\n"
				+ "3- Carpma Islemi\n"
				+ "4- Bolme Islemi\n"
				+ "5- Uslu Sayi Hesaplama\n"
				+ "6- Faktoriyel Hesaplama\n"
				+ "7- Mod Alma\n"
				+ "8- Dikdortgen Alan ve Cevre Hesabi\n"
				+ "0- Cýkýs Yap";
		
		do {
			System.out.println(menu);
			System.out.println("Bir islem seciniz : ");
			select = scan.nextInt();
			switch(select) {
				case 1:
					plus();
					break;
				case 2:
					minus();
					break;
				case 3:
					times();
					break;
				case 4:
					divided();
					break;
				case 5:
					power();
					break;
				case 6:
					factorial();
					break;
				case 7:
					mod();
					break;
				case 8:
					area();
				default:
					System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
			}
		}while(select != 0);
		
	}
}
