import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer customerLee = new Customer(10010, "이순신");
		Customer customerShin = new Customer(10020, "신사임당");
		Customer customerHong = new GoldCustomer(10030, "홍길동");
		Customer customerYoul = new GoldCustomer(10040, "이율곡");
		Customer customerKim = new VIPCustomer(10050, "김유신", 12345);
		
		customerList.add(customerLee);
		customerList.add(customerShin);
		customerList.add(customerHong);
		customerList.add(customerYoul);
		customerList.add(customerKim);
		
		System.out.println("====== 고객 정보 출력 ======");
		for (Customer customer : customerList)
			System.out.println(customer.showCustomerInfo());
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
		}
	}
}

//https://seong-jun.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EC%83%81%EC%86%8D%EC%9D%84-%ED%99%9C%EC%9A%A9%ED%95%9C-%EB%A9%A4%EB%B2%84%EC%89%BD-%ED%81%B4%EB%9E%98%EC%8A%A4-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0

//https://domybestinlife.tistory.com/244