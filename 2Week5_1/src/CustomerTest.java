
public class CustomerTest {
	public static void main(String[] args) {
		System.out.println("Cusomer () ������ ȣ��");
		
		Customer a = new Customer();
		a.setCustomerName("�̼���");
		a.setCustomerID(10010);
		a.bonusPoint = 1000;
		
		System.out.println(a.showCustomerInfo());
		
		System.out.println("Cusomer () ������ ȣ��");
		
		VIPCustomer b = new VIPCustomer();
		b.setCustomerName("������");
		b.setCustomerID(10020);
		b.bonusPoint = 10000;
		
		System.out.println(b.showCustomerInfo());
	}
}