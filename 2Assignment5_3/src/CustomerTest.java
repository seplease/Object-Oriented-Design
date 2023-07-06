import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customerLee = new Customer(10010, "�̼���");
		Customer customerShin = new Customer(10020, "�Ż��Ӵ�");
		Customer customerHong = new GoldCustomer(10030, "ȫ�浿");
		Customer customerYoul = new GoldCustomer(10040, "������");
		Customer customerKim = new VIPCustomer(10050, "������", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== �� ���� ��� ======");
		for (Customer customer : customerList)
			System.out.println(customer.showCustomerInfo());
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "���Դϴ�.");
		}
	}
}

//https://seong-jun.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EC%83%81%EC%86%8D%EC%9D%84-%ED%99%9C%EC%9A%A9%ED%95%9C-%EB%A9%A4%EB%B2%84%EC%89%BD-%ED%81%B4%EB%9E%98%EC%8A%A4-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0

//https://domybestinlife.tistory.com/244