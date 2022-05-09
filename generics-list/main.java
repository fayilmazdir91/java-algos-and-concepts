package liste;

public class main {
	public static void main(String[] args) {
		  MyList<Integer> liste = new MyList<>();
	        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Bo�" : "Dolu"));
	        liste.add(10);
	        liste.add(20);
	        liste.add(30);
	        liste.add(40);
	        liste.add(20);
	        liste.add(50);
	        liste.add(60);
	        liste.add(70);

	        System.out.println("Liste Durumu : " + (liste.isEmpty() ? "Bo�" : "Dolu"));

	        // Buldu�u ilk indeksi verir
	        System.out.println("Indeks : " + liste.indexOf(20));

	        // Bulamazsa -1 d�nd�r�r
	        System.out.println("Indeks :" + liste.indexOf(100));

	        // Buldu�u son indeksi verir
	        System.out.println("Indeks : " + liste.lastIndexOf(20));

	       

	        // De�erim listedeki olup olmad���n� sorgulad�
	        System.out.println("Listemde 20 de�eri : " + liste.contains(20));
	        System.out.println("Listemde 120 de�eri : " + liste.contains(120));

	        // Listeyi tamamen bo�alt�r ve varsay�lan boyutuna �evirir
	        liste.clear();
	        System.out.println(liste.toString());
	}
}
