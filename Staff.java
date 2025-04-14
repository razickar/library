package library;

public class Staff extends User {
	
	
	Account account;
	
	public Staff(String userName,int id,String password,Account account) {
		super(userName,id,password);
		this.account = account;
		
		
	}

}
