package part1;

public class Ex3_Customer {

	private int id;
	private String name;
	private Ex1a_SavingAccount account;
	
	public Ex3_Customer(int id, String name, Ex1a_SavingAccount account) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Ex1a_SavingAccount getAccount() {
		return account;
	}
	public void setAccount(Ex1a_SavingAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", account=" + account + "]";
	}
	
}
