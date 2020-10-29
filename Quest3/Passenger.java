/**
* Passengers will be stored in a HashSet. To ensure no duplicates can be stored,
* you will need a hashCode and equals method.
*
* Hint: name, email, and accountType could create a nice, unique hash value.
*/
public class Passenger extends User {
	
	// BUSINESS, PERSONAL, etc.
	private String accountType;

	public Passenger() {
		super();
	}

	public Passenger(String name, String accountType) {
		super();
		this.setName(name);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
    @Override
    public int hashCode() {
        String code = "";
        code.concat(this.getName());
        code.concat(this.getEmail());
        code.concat(accountType);
        int num_code = Integer.parseInt(code);
        return num_code;
    }
    
    public Boolean equals(int hashCodeToTest) {
        int code = this.hashCode();
        return hashCodeToTest == code;
    }
	
}
