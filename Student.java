package library;

public class Student extends User{
	
	Account account;
	
	
	public Student(String userName,int id,String password,Account account) {
		super(userName,id,password);
		this.account = account;
		
	}

}
