package patikaStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Panel {
	NotebookFunctions notebookFunctions = new NotebookFunctions();
	CellPhoneFunctions cellPhoneFunctions = new CellPhoneFunctions();
	ArrayList<Brand> brandList = new ArrayList<>();
	TreeSet<Brand> Marka = new TreeSet<>();
	Scanner scan = new Scanner(System.in);
	boolean running = true;
	
	public void addBrands() {
		Marka.add(new Brand(1, "Samsung"));
		Marka.add(new Brand(2, "Lenovo"));
		Marka.add(new Brand(3, "Apple"));
		Marka.add(new Brand(4, "Huawei"));
		Marka.add(new Brand(5, "Casper"));
		Marka.add(new Brand(6, "Asus"));
		Marka.add(new Brand(7, "HP"));
		Marka.add(new Brand(8, "Xiaomi"));	
		Marka.add(new Brand(9, "Monster"));
		
		
	}

	public void run () {
		
		addBrands();
		
		while(running) {

			System.out.println("PatikaStore Ürün Yönetim Paneli !");
			System.out.println("1 - Notebook Ýþlemleri\n2 - Cep Telefonu Ýþlemleri\n3 - Marka Listele\n0 - Çýkýþ Yap");
			System.out.println("Tercihiniz : ");
			int chooser = scan.nextInt();
			if(chooser == 1) {
				notebookFunctions.run(brandList);
				break;
			}else if(chooser == 2) {
				cellPhoneFunctions.run();
				break;
			}else if(chooser == 3) {
				System.out.println("Markalarýmýz");
				System.out.println("--------------");
				for(Brand Markalar : Marka) {
					System.out.println("- " + Markalar.getName());
				}
				System.out.println("--------------");
				break;
			}else if(chooser == 0) {
				System.out.println("Çýkýþ yaptýnýz.");
				running = false;
                break;
			}
			else {			
			System.out.println("Hatalý deðer girdiniz. Lütfen geçerli bir deðer giriniz.");
			}
		}		
	}

}
