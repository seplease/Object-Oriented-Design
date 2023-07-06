import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.*;

public class M3 {
	public static void main(String[] args) {
		int i;
		char c;
		try (
				FileInputStream fis = new FileInputStream("course.txt");
				InputStreamReader isr = new InputStreamReader(fis);) {
					while(isr.ready())
						i = isr.read();
						c = (char)fis.read();
					System.out.print(c);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
}