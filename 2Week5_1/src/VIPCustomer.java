
public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		bonusRatio = 0.05;
		saleRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public void VIPCustomer(int id, String name, int agentID) {
		id = customerID;
		name = customerName;
		agentID = agentID;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price *= 0.9;
		return price;
	}
	
	public int getAgentID() {
		return agentID;
	}
}