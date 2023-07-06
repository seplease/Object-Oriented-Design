import java.util.*;
public class Book {
	private String title;
	private int page;
	private String author;
	
	public Book() {
		
	}
	public Book(String t, int p, String a) {
		this.title = t;
		this.page = p;
		this.author = a;
	}
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public int getPage() { return page; }
	public void setPage(int page) { this.page = page; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
}