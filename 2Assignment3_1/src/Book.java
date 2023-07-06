import java.util.*;
public class Book {
	private String title;
	private String author;
	
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title; }
	public String getAuthor() { return author; }
	public void setAuthor(String author) { this.author = author; }
	
	public String toString() {
		return "���� : " + title + ", ���� : " + author;
	}
}