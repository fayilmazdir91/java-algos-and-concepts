package patikaJava;
import java.util.Scanner;
public class BasitKullanýcýGiriþi {
	public static void main(String[] args) {
		String userName, password, newPassword;
		int secim;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanici Adi: ");
		userName = input.nextLine();
		
		System.out.println("Sifre: ");
		password = input.nextLine();
		
		if(userName.equals("aaa") && password.equals("bbb") ) {
			System.out.println("Giris yapildi. Hosgeldiniz.");
		}
		else if(userName.equals("aaa") && password != "bbb"){
			System.out.println("Giris basarisiz. Sifreniz hatali.");
			System.out.println("Sifrenizi sifirlamak ister misiniz ? :\nEvet ise 1'e \nHayir ise 2'ye basiniz.");
			secim = input.nextInt();
			if(secim == 1) {
				System.out.println("Yeni sifre: ");
				newPassword = input.next();
				if(newPassword.equals("bbb")) {
					System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
				}
				else {
					System.out.println("Sifre olusturuldu.");
					password = newPassword;
				}
			}
			else if(secim == 2){
				System.out.println("Login ekranindan cikildi.");
			}
			else {
				System.out.println("Gecerli bir deger girilmedi.");
			}
		}
		else {
			System.out.println("Kullanici bulunamadi.");
		}
	}
}
