package patikaStore;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NotebookFunctions {
	List<Notebook> Diz�st� = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	
	
	void run (ArrayList<Brand> brandList) {
		Diz�st�.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Diz�st�.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Diz�st�.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Diz�st�.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		System.out.println("Ne yapmak istiyorsun ?\n1-Notebook �r�nlerini listele\n2-Notebook t�r�nde �r�n ekle\n3-Notebook t�r�nde �r�n sil");
		int  chooser1 = scan.nextInt();
		if(chooser1 == 1) {
			printNotebookList();
		}else if(chooser1 == 2) {
			addNotebook(brandList);
		}else if(chooser1 == 3) {
			deleteNotebook(brandList);
		}
		else {
			System.out.println("Ge�ersiz bir de�er girdiniz.");
		}
	}
	
	public void addNotebook(ArrayList<Brand> brandList) {
		Diz�st�.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		int i = Diz�st�.size() - 1;
		System.out.println("Ekleyece�iniz �r�n�n �zelliklerini giriniz.");
		System.out.println("�r�n�n Markas� : ");
		String brand = scan.next();
		Diz�st�.get(i).setBrand(brand);
		System.out.println("�r�n�n Ad� : ");
		String name = scan.next();
		Diz�st�.get(i).setName(name);
		System.out.println("�r�n�n Ekran Boyutu : ");
		double screenSize = scan.nextDouble();
		Diz�st�.get(i).setScreenSize(screenSize);
		System.out.println("�r�n�n Depolama Alan� : ");
		int storage = scan.nextInt();
		Diz�st�.get(i).setStorage(storage);
		System.out.println("�r�n�n RAM boyutu : ");
		int ram = scan.nextInt();
		Diz�st�.get(i).setRam(ram);;
		System.out.println("�r�n�n Fiyat� : ");
		double price = scan.nextDouble();
		Diz�st�.get(i).setPrice(price);
		System.out.println("�r�n�n �ndirim Oran� : ");
		int discountRate = scan.nextInt();
		Diz�st�.get(i).setDiscountRate(discountRate);
		System.out.println("�r�n�n Adedi : ");
		int stock = scan.nextInt();
		Diz�st�.get(i).setStock(stock);
		System.out.println("---------------------------------");
	}
	
	public void printNotebookList() {
		System.out.println("1-T�m�n� listele\n2-ID aral���na g�re listele\n3-Markaya g�re listele");
		int chooser1o1 = scan.nextInt();
		if(chooser1o1 == 1) {
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Diz�st�.size(); i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Diz�st�.get(i).name,  Diz�st�.get(i).price, Diz�st�.get(i).brand, Diz�st�.get(i).storage, Diz�st�.get(i).screenSize, Diz�st�.get(i).ram);
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
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = chooser1o1o2n1; i<=chooser1o1o2n2; i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Diz�st�.get(i).name,  Diz�st�.get(i).price, Diz�st�.get(i).brand, Diz�st�.get(i).storage, Diz�st�.get(i).screenSize, Diz�st�.get(i).ram);
				System.out.println();
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
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | �r�n Ad�                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Diz�st�.size(); i++) {
				if(chooser1o1o3 == Diz�st�.get(i).brand) {
					System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Diz�st�.get(i).name,  Diz�st�.get(i).price, Diz�st�.get(i).brand, Diz�st�.get(i).storage, Diz�st�.get(i).screenSize, Diz�st�.get(i).ram);
					System.out.println();	
				}
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Ge�ersiz bir de�er girdiniz.");
		}	
	}
	
	public void deleteNotebook(ArrayList<Brand> brandList) {
		System.out.println("Silinmesini istedi�iniz �r�n�n ID'sini giriniz =>");
		int chooser1o3 = scan.nextInt();
		if(chooser1o3 < Diz�st�.size() && chooser1o3 >= 0 ) {
			Diz�st�.remove(chooser1o3);
			System.out.println("Silme i�lemi ba�ar�yla ger�ekle�ti.\nSilinen �r�n�n ID'si : " + chooser1o3);
			System.out.println("--------------------------------");
		}else {
			System.out.println("Ge�ersiz de�er girdiniz.");
		}
	}
}
