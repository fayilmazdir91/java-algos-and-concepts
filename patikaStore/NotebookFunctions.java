package patikaStore;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NotebookFunctions {
	List<Notebook> Dizüstü = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	
	
	
	void run (ArrayList<Brand> brandList) {
		Dizüstü.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Dizüstü.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Dizüstü.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		Dizüstü.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		System.out.println("Ne yapmak istiyorsun ?\n1-Notebook ürünlerini listele\n2-Notebook türünde ürün ekle\n3-Notebook türünde ürün sil");
		int  chooser1 = scan.nextInt();
		if(chooser1 == 1) {
			printNotebookList();
		}else if(chooser1 == 2) {
			addNotebook(brandList);
		}else if(chooser1 == 3) {
			deleteNotebook(brandList);
		}
		else {
			System.out.println("Geçersiz bir deðer girdiniz.");
		}
	}
	
	public void addNotebook(ArrayList<Brand> brandList) {
		Dizüstü.add(new Notebook(7000.0, 25.0, 14, "Macbook ", "Apple", 16, 512, 16.1));
		int i = Dizüstü.size() - 1;
		System.out.println("Ekleyeceðiniz ürünün özelliklerini giriniz.");
		System.out.println("Ürünün Markasý : ");
		String brand = scan.next();
		Dizüstü.get(i).setBrand(brand);
		System.out.println("Ürünün Adý : ");
		String name = scan.next();
		Dizüstü.get(i).setName(name);
		System.out.println("Ürünün Ekran Boyutu : ");
		double screenSize = scan.nextDouble();
		Dizüstü.get(i).setScreenSize(screenSize);
		System.out.println("Ürünün Depolama Alaný : ");
		int storage = scan.nextInt();
		Dizüstü.get(i).setStorage(storage);
		System.out.println("Ürünün RAM boyutu : ");
		int ram = scan.nextInt();
		Dizüstü.get(i).setRam(ram);;
		System.out.println("Ürünün Fiyatý : ");
		double price = scan.nextDouble();
		Dizüstü.get(i).setPrice(price);
		System.out.println("Ürünün Ýndirim Oraný : ");
		int discountRate = scan.nextInt();
		Dizüstü.get(i).setDiscountRate(discountRate);
		System.out.println("Ürünün Adedi : ");
		int stock = scan.nextInt();
		Dizüstü.get(i).setStock(stock);
		System.out.println("---------------------------------");
	}
	
	public void printNotebookList() {
		System.out.println("1-Tümünü listele\n2-ID aralýðýna göre listele\n3-Markaya göre listele");
		int chooser1o1 = scan.nextInt();
		if(chooser1o1 == 1) {
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | Ürün Adý                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Dizüstü.size(); i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Dizüstü.get(i).name,  Dizüstü.get(i).price, Dizüstü.get(i).brand, Dizüstü.get(i).storage, Dizüstü.get(i).screenSize, Dizüstü.get(i).ram);
				System.out.println();
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
			
		}else if(chooser1o1 == 2) {
			System.out.println("ID aralýðý belirleyiniz.");
			System.out.println("Baþlangýç ID");
			int chooser1o1o2n1 = scan.nextInt();
			System.out.println("Bitiþ ID");
			int chooser1o1o2n2 = scan.nextInt();
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | Ürün Adý                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = chooser1o1o2n1; i<=chooser1o1o2n2; i++) {
				System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Dizüstü.get(i).name,  Dizüstü.get(i).price, Dizüstü.get(i).brand, Dizüstü.get(i).storage, Dizüstü.get(i).screenSize, Dizüstü.get(i).ram);
				System.out.println();
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
			
		//  ----------------------
		// |	------------	  |	
		// |   | TEKRAR DÖN |	  |
		// |	------------	  |
		//  ----------------------
		}else if(chooser1o1 == 3) {
			System.out.println("Marka belirleyiniz => ");
			String chooser1o1o3 = scan.next();
			System.out.println("Notebook Listesi");
			System.out.println("----------------------------------------------------------------------------------------------------");
			System.out.println("| ID | Ürün Adý                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
			System.out.println("----------------------------------------------------------------------------------------------------");
			for(int i = 0; i < Dizüstü.size(); i++) {
				if(chooser1o1o3 == Dizüstü.get(i).brand) {
					System.out.printf("| %d  | %s                      | %.5g TL | %s     | %d       | %.3g      | %d          |", i, Dizüstü.get(i).name,  Dizüstü.get(i).price, Dizüstü.get(i).brand, Dizüstü.get(i).storage, Dizüstü.get(i).screenSize, Dizüstü.get(i).ram);
					System.out.println();	
				}
			}
			System.out.println("----------------------------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Geçersiz bir deðer girdiniz.");
		}	
	}
	
	public void deleteNotebook(ArrayList<Brand> brandList) {
		System.out.println("Silinmesini istediðiniz ürünün ID'sini giriniz =>");
		int chooser1o3 = scan.nextInt();
		if(chooser1o3 < Dizüstü.size() && chooser1o3 >= 0 ) {
			Dizüstü.remove(chooser1o3);
			System.out.println("Silme iþlemi baþarýyla gerçekleþti.\nSilinen ürünün ID'si : " + chooser1o3);
			System.out.println("--------------------------------");
		}else {
			System.out.println("Geçersiz deðer girdiniz.");
		}
	}
}
