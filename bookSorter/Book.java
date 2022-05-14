package bookSorter;

public class Book implements Comparable <Book>{
	private String bookName;
	private String authorName;
	private int pageNumber;
	private int releaseDate;
	private String Space;
	
	public Book(String bookName, String authorName, int pageNumber, String Space, int releaseDate) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.pageNumber = pageNumber;
		this.Space = Space;
		this.releaseDate = releaseDate;
	}


	public String getSpace() {
		return Space;
	}


	public void setSpace(String space) {
		Space = space;
	}


	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		return (this.getBookName().compareTo(book.getBookName()));
	}
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}



}
