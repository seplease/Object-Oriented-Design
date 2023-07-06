
public class CustomerTest {
	public static void main(String[] args) {
		System.out.println("Cusomer () 생성자 호출");
		
		Customer a = new Customer();
		a.setCustomerName("이순신");
		a.setCustomerID(10010);
		a.bonusPoint = 1000;
		
		System.out.println(a.showCustomerInfo());
		
		System.out.println("Cusomer () 생성자 호출");
		
		VIPCustomer b = new VIPCustomer();
		b.setCustomerName("김유신");
		b.setCustomerID(10020);
		b.bonusPoint = 10000;
		
		System.out.println(b.showCustomerInfo());
	}
}