import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment13_1 {
	public static void main(String[] args) throws Exception {		
		try (FileReader fr = new FileReader("C:\\in.txt")) {
			int ch;
			while ((ch = fr.read()) != -1) {
				ch = Character.toUpperCase(ch);
				System.out.print((char) ch);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}