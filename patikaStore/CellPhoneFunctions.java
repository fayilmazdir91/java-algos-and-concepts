package patikaStore;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class CellPhoneFunctions {
	Scanner scan = new Scanner(System.in);
	
	List<CellPhone> Telefon = new ArrayList<>();
	
	void run () {

		Telefon.add(new CellPhone(7000.0, 20, 21, "IPhone", "Apple", 64, 6.1, 4000, 8, "Siyah"));
		System.out.println("Ne yapmak istiyorsun ?\n1-Telefon �r�nlerini listele\n2-Telefon t�r�nde �r�n ekle\n3-Telefon t�r�nde �r�n sil");
		int  chooser1 = scan.nextInt();
		if(chooser1 == 1) {
			printCellPhone();
		}else if(chooser1 == 2) {
			addCellPhone();
		}else if(chooser1 == 3) {
			deleteCellPhone();
		}
		else {
			System.out.println("Ge�ersiz bir de�er girdiniz.");
		}
	}
	
	public void addCellPhone() {
		Telefon.add(new CellPhone(7000.0, 20, 21, "IPhone", "Apple", 64, 6.1, 4000, 8, "Siyah"));
		int i = Telefon.size() - 1;
		System.out.println("Ekleyece�iniz �r�n�n �zelliklerini giriniz.");
		System.out.println("�r�n�n Markas� : ");
		String brand = scan.next();
		Telefon.get(i).setBrand(brand);
		System.out.println("�r�n�n Ad� : ");
		String name = scan.next();
		Telefon.get(i).setName(name);
		System.out.println("�r�n�n Ekran Boyutu : ");
		double screenSize = scan.nextDouble();
		Telefon.get(i).setScreenSize(screenSize);
		System.out.println("�r�n�n RAM boyutu : ");
		int ram = scan.nextInt();
		Telefon.get(i).setRam(ram);;
		System.out.println("�r�n�n Fiyat� : ");
		double price = scan.nextDouble();
		Telefon.get(i).setPrice(price);
		System.out.println("�r�n�n Adedi : ");
		int stock = scan.nextInt();
		Telefon.get(i).setStock(stock);
		System.out.println("---------------------------------");
	}
	
	public void printCellPhone() {
		System.out.println("1-T�m�n� listele\n2-ID aral���na g�re listele\n3-Markaya g�re listele");
		int chooser1o1 = scan.nextInt();
		if(chooser1o1 == 1) {
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Telefon.size(); i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);
				System.out.println();
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
			
		}else if(chooser1o1 == 2) {
			System.out.println("ID aral��� belirleyiniz.");
			System.out.println("Ba�lang�� ID");
			int chooser1o1o2n1 = scan.nextInt();
			System.out.println("Biti� ID");
			int chooser1o1o2n2 = scan.nextInt();
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = chooser1o1o2n1; i<=chooser1o1o2n2; i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);				System.out.println();
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
			
		//  ----------------------
		// |	------------	  |	
		// |   | TEKRAR D�N |	  |
		// |	------------	  |
		//  ----------------------
		}else if(chooser1o1 == 3) {
			System.out.println("Marka belirleyiniz => ");
			String chooser1o1o3 = scan.next();
			System.out.println("Telefon Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Telefon.size(); i++) {
				if(chooser1o1o3 == Telefon.get(i).brand) {
					System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d           | %d          |", i, Telefon.get(i).name,  Telefon.get(i).price, Telefon.get(i).brand, Telefon.get(i).screenSize, Telefon.get(i).ram);					System.out.println();	
				}
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Ge�ersiz bir de�er girdiniz.");
		}	
	}
	
	public void deleteCellPhone() {
		System.out.println("Silinmesini istedi�iniz �r�n�n ID'sini giriniz =>");
		int chooser1o3 = scan.nextInt();
		if(chooser1o3 < Telefon.size() && chooser1o3 >= 0 ) {
			Telefon.remove(chooser1o3);
			System.out.println("Silme i�lemi ba�ar�yla ger�ekle�ti.\nSilinen �r�n�n ID'si : " + chooser1o3);
			System.out.println("--------------------------------");
		}else {
			System.out.println("Ge�ersiz de�er girdiniz.");
		}
	}
}
