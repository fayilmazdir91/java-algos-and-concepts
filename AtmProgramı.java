package patikaJava;
import java.util.Scanner;

public class AtmProgramý {

    public static void main(String[] args) {
        String user="kaan";
        int pass=123;
        byte girisHakki=3;
        int bakiye=1000;
        int secim;
        Scanner scanner= new Scanner(System.in);
        while (true) {
            System.out.print("Kullanýcý Adýnýzý Giriniz : ");
            String userName = scanner.next();
            System.out.print("Þifrenizi Giriniz : ");
            int password = scanner.nextInt();
            if (userName.equals(user) && password == pass) {
                System.out.println("Bankamýza Hoþgeldiniz");
                do {
                    System.out.print("" +
                            "Para Yatýrma : 1\n" +
                            "Para Çekme : 2\n" +
                            "Bakiye Sorgula : 3\n" +
                            "Çýkýþ Yap : 4\n");
                    System.out.println("Yapmak istediðiniz iþlemi seçiniz :");
                    secim = scanner.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Yatýrmak istediðiniz miktarý yazýnýz : ");
                            int yatirilan = scanner.nextInt();
                            bakiye += yatirilan;
                            System.out.println("Ýþleminiz gerçekleþtirildi. Güncel Bakiyeniz : " + bakiye);
                            break;
                        case 2:
                            System.out.println("Çekmek istediðiniz miktarý yazýnýz.");
                            int cekilen = scanner.nextInt();
                            if (cekilen > bakiye)
                                System.out.println("Bakiyeniz yetersiz. Bakiyeniz : " + bakiye);
                            else {
                                bakiye -= cekilen;
                                System.out.println("Ýþleminiz gerçekleþtirildi. Kalan bakiyeniz : " + bakiye);
                            }
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.println("Çýkýþ yapýldý.");
            } else {
                girisHakki--;
                System.out.println("Hatalý kullanýcý adý veya þifre girdiniz. Tekrar deneyiniz:");
                if(girisHakki==0){
                    System.out.println("Hesabýnýz bloke olmuþtur.");
                    System.exit(0);
                }
            }
        }

    }
}