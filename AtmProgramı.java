package patikaJava;
import java.util.Scanner;

public class AtmProgram� {

    public static void main(String[] args) {
        String user="kaan";
        int pass=123;
        byte girisHakki=3;
        int bakiye=1000;
        int secim;
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.print("Kullan�c� Ad�n�z� Giriniz : ");
            String userName = scanner.next();
            System.out.print("�ifrenizi Giriniz : ");
            int password = scanner.nextInt();
            if (userName.equals(user) && password == pass) {
                System.out.println("Bankam�za Ho�geldiniz");
                do {
                    System.out.print("" +
                            "Para Yat�rma : 1\n" +
                            "Para �ekme : 2\n" +
                            "Bakiye Sorgula : 3\n" +
                            "��k�� Yap : 4\n");
                    System.out.println("Yapmak istedi�iniz i�lemi se�iniz :");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yat�rmak istedi�iniz miktar� yaz�n�z : ");
                            int yatirilan = scanner.nextInt();
                            bakiye += yatirilan;
                            System.out.println("��leminiz ger�ekle�tirildi. G�ncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.println("�ekmek istedi�iniz miktar� yaz�n�z.");
                            int cekilen = scanner.nextInt();
                            if (cekilen > bakiye)
                                System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + bakiye);
                            else {
                                bakiye -= cekilen;
                                System.out.println("��leminiz ger�ekle�tirildi. Kalan bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("��k�� yap�ld�.");
            } else {
                girisHakki--;
                System.out.println("Hatal� kullan�c� ad� veya �ifre girdiniz. Tekrar deneyiniz:");
                if(girisHakki==0){
                    System.out.println("Hesab�n�z bloke olmu�tur.");
                    System.exit(0);
                }
            }
        }

    }
}