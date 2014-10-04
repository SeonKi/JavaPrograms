
public class Cart {
	
	private int custId;
	private String firstName;
	private String lastName;
	private int itemNumber;
	
	public Cart(int custId, String firstName, String lastName, int itemNumber){
		this.custId = custId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.itemNumber = itemNumber;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}



}
