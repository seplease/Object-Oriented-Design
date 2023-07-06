import java.util.*;

public class Student implements Comparable {
	private String name;
	private int id;
	private int korean;
	private int english;
	private int math;
	int total = 0;
	double avg = 0;

	Student() {

	}

	Student(String name, int id, int korean, int english, int math) {
		this.name = name;
		this.id = id;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public int getTotal() {
		total = (this.korean + this.english + this.math);
		return total;
	}

	public double getAvg() {
		avg = total / 3;
		return avg;
	}

	public String toString() {
		return name + ", " + id + ", " + korean + ", " + english + ", " + math + ", " + total;
	}

	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.name.compareTo(other.name));
	}
}