import java.util.*;
public class Assignment10_1 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동", 1, 100, 100, 100));
		students.add(new Student("송중기", 2, 90, 60, 80));
		students.add(new Student("김자바", 3, 70, 80, 75));
		students.add(new Student("이자바", 4, 80, 75, 90));
		students.add(new Student("안자바", 5, 90, 60, 100));
		
		Collections.sort(students);
		
		students.toString();
	}
}