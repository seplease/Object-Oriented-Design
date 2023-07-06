import java.util.*;
class Student implements Comparable {
	public String id;
	public String name;
	
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Object obj) {
		Student other = (Student) obj;
		return (this.id.compareTo(other.id));
	}
}