package bookList;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		Map<String,String> newList = new LinkedHashMap<>();
		
		bookList.add(new Book("Book1", 150, "Author1", 1918));
		bookList.add(new Book("Book2", 50, "Author2", 1928));
		bookList.add(new Book("Book3", 75, "Author3", 1938));
		bookList.add(new Book("Book4", 450, "Author4", 1948));
		bookList.add(new Book("Book5", 80, "Author5", 1958));
		bookList.add(new Book("Book6", 650, "Author6", 1968));
		bookList.add(new Book("Book7", 750, "Author7", 1978));
		bookList.add(new Book("Book8", 59, "Author8", 1988));
		bookList.add(new Book("Book9", 950, "Author9", 1998));
		bookList.add(new Book("Book10", 1050, "Author10", 2008));
		
		bookList.stream().forEach(i->{
			newList.put(i.getBookName(), i.getAuthor());
		});
		for (String k:newList.keySet()) {
			System.out.println(k+" --- "+newList.get(k));
		}
		
		System.out.println();
		System.out.println("BOOKS OVER 100 PAGE");
		System.out.println("-------------------");
		
		ArrayList<Book>books=new ArrayList<>();
		bookList.stream().filter(i-> i.getNumberOfPages()>100).forEach(i -> {
			books.add(i);
		});
		
		books.stream().forEach(i -> {
			System.out.println(i.getBookName()+" --- "+ i.getNumberOfPages());
		});
	}
}
