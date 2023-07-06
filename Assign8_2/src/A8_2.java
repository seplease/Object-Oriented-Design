
public class A8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.info();
		cat.info();
		System.out.println(dog.breed);
		System.out.println(cat.breed);
	}
	
	class Cat {
		String breed = "Persian";
		void info() {
			System.out.println(this.breed);
		}
	}

}
