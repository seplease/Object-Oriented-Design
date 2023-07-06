import java.util.*;
public class Magazine extends Book {
	private String date;
	
	public Magazine() {
		
	}
	public Magazine(String d) {
		this.date = d;
	}
	
	public String getDate() { return date; }
	public void setDate(String date) { this.date = date; }
}