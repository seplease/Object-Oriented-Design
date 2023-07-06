import java.util.*;
public class PersonTest {
	public static void main(String[] args) {
		Person[] array = new Person[3];
		array[0] = new Person("홍길동", 180);
		array[1] = new Person("이길동", 170);
		array[2] = new Person("김길동", 190);
		
		System.out.println("[제일 키 큰 사람]");
		System.out.print("이름 : " + array[getMax(array)].name + ", height : " + array[getMax(array)].tall);
	}
	
	public static int getMax(Person[] array) {
		int maxIndex = 0;
		int x = 0;
		
		for (int i = 0; i < array.length; i++) {
			x = array[x].compareTo(array[i]);
			if (x == -1)
				maxIndex = i;
		}
		return maxIndex;
	}
}