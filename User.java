package library;

public class User {
	
	private String userName;
	private int id;
	private String password;
	
	public User(String userName,int id,String password) {
		this.userName = userName;
		this.id = id;
		this.password = password;
	}
	
	public String getUserName() {
	    return userName;
	}

	public int getId() {
	    return id;
	}
	
	public String getPassword() {
	    return password;
	}

	public void verify() {
		System.out.println("verified....");
	}
	
	public void checkAccount() {
		
	}
	
	public void get_book_info() {
		
	}

}
