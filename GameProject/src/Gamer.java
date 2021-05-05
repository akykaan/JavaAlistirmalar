
public class Gamer {
	private int id;
	private String firstName;
	private String lastName;
	private int tcNo;
	private String dogumYýlý;
	
	
	public Gamer(int id, String firstName, String lastName, int tcNo, String dogumYýlý) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
		this.dogumYýlý = dogumYýlý;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getTcNo() {
		return tcNo;
	}
	public void setTcNo(int tcNo) {
		this.tcNo = tcNo;
	}
	public String getDogumYýlý() {
		return dogumYýlý;
	}
	public void setDogumYýlý(String dogumYýlý) {
		this.dogumYýlý = dogumYýlý;
	}
}
