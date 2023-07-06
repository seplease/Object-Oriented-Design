import java.util.*;
public class Assignment4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		String id;
		String name;
		
		System.out.print("배열의 크기는>>");
		int n = sc.nextInt();
		Student[] students = new Student[n];
		
		for (i = 0; i < students.length; i++) {
			System.out.print("학번>>");
			id = sc.next();
			System.out.print("이름>>");
			name = sc.next();
			students[i] = new Student(id, name);
		}
		Arrays.sort(students);
		for (Student s : students)
			System.out.println("학번 = " + s.id + ", 이름 = " + s.name);
	}
}