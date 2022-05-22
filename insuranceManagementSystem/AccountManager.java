package insuranceManagementSystem;

import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
	TreeSet<Account> accs = new TreeSet<>();
	
	Scanner Email = new Scanner(System.in); 
	Scanner Password = new Scanner(System.in); 
	void login() {
		
		System.out.println("E-mail : ");
		Email.next();
		System.out.println("Password : ");
		Password.next();		
		if(user.toString() == user.email && user.toString() == user.password) {
			LoggedIn = AuthenticationStatus.SUCCESS;
			System.out.println("Logged in Successfully !");
		}else {
			throw new InvalidAuthenticationException();
		}
	}
}
