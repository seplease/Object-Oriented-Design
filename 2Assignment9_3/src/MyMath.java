import java.lang.reflect.Array;

public class MyMath<T> {
	public static <T extends Number> double getAverage(T[] array) {
		double result = 0.0;
		for (int i = 0; i < array.length; i++)
			result += Double.parseDouble(array[i] + " ");
		result = result / array.length;
		return result;
	}
}