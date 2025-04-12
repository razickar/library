package zoho;
import java.util.*;

public class RazickarLibrary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RAZICKAR LIBRARY....");
		
		while(true) {
			
			System.out.println("ENTER YOUR CHOICE...");
			System.out.println("1.LOGIN");
			System.out.println("2.REGISTER");
			System.out.println("3.EXIT");
			int choice = sc.nextInt();
			sc.nextLine();
			
			
			switch(choice) {
			case 1 :
				System.out.println("enter USER name ");
				String loginUserName = sc.nextLine();
				System.out.println("enter PASSWORD ");
				String loginUserPassword = sc.nextLine();
				System.out.println(loginUserName+"  &  "+loginUserPassword);
				break;
				
			case 2:
				System.out.println("enter USER name");
				String registerUserName = sc.nextLine();
				System.out.println("enter PASSWORD ");
				String registerUserPassword = sc.nextLine();
				System.out.println("enter your Position (student/staff/librarian)");
				String registerUserPosition = sc.nextLine();
				System.out.println(registerUserName+"  &  "+registerUserPassword+" & "+registerUserPosition);
				break;
				
			case 3:
				System.out.println("THANK YOU CONNECT WITH US");
				sc.close();
				return;
			default :
				System.out.println("enter valid values");
			}
			
			}
	
	
	}

}
