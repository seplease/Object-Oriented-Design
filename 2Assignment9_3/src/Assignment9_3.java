import java.util.*;

public class Assignment9_3 {
	public static void main(String[] args) {
		MyMath<Number> mymath = new MyMath<Number>();
		Integer[] array = { 1, 2, 3, 4, 5, 6 };

		System.out.print("¹è¿­ " + Arrays.toString(array) + "ÀÇ Æò±Õ : " + mymath.getAverage(array));
	}
}