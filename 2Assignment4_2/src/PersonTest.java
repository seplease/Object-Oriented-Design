import java.util.*;
public class PersonTest {
	public static void main(String[] args) {
		Person[] array = new Person[3];
		array[0] = new Person("ȫ�浿", 180);
		array[1] = new Person("�̱浿", 170);
		array[2] = new Person("��浿", 190);
		
		System.out.println("[���� Ű ū ���]");
		System.out.print("�̸� : " + array[getMax(array)].name + ", height : " + array[getMax(array)].tall);
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