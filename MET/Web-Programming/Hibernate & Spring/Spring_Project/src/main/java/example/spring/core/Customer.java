package example.spring.core;

public class Customer {
	private String customerId;
	private String name;
	private Address permanentAddress;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String name, Address permanentAddress) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.permanentAddress = permanentAddress;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", permanentAddress=" + permanentAddress + "]";
	}

}
