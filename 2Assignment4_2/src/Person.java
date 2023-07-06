public class Person {
	public String name;
	public int tall;

	Person(String name, int tall) {
		this.name = name;
		this.tall = tall;
	}
	
	public int compareTo(Person obj) {
		Person other = (Person) obj;
		
		if (this.tall < other.tall)
			return -1;
		else if (this.tall > other.tall)
			return 1;
		else
			return 0;
	}
}