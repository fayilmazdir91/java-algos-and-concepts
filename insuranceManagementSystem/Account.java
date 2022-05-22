package insuranceManagementSystem;

import java.util.List;

enum AuthenticationStatus {
	SUCCESS,
	FAIL
};

public abstract class Account implements Comparable<Account>{
		
	private AuthenticationStatus LoggedIn = AuthenticationStatus.FAIL;
	User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Insurance> getInsuranceList() {
		return InsuranceList;
	}

	public void setInsuranceList(List<Insurance> insuranceList) {
		InsuranceList = insuranceList;
	}

	List<Insurance> InsuranceList;
	
	final void showUserInfo() {
		System.out.printf("Ýsim : %s\nYaþ : %d\nE-mail : %s\nÝþ : %s", user.getName() + user.getAge() + user.getEmail() + user.getJob());
	}
	
	void login() throws InvalidAuthenticationException {
	
		if(user.toString() == user.email && user.toString() == user.password) {
			LoggedIn = AuthenticationStatus.SUCCESS;
			System.out.println("Logged in Successfully !");
		}else {
			throw new InvalidAuthenticationException();
		}
	}
		
	
	
	void accAddAddress() {
		AddressManager.addAddress();
	}
	
	void accDelAddress() {
		AddressManager.delAddress();
	}
	
	boolean LogStatus () {
		
		if(LoggedIn == AuthenticationStatus.SUCCESS) {
			return true;
		}else {			
			return false;
		}
	}
	
	abstract void addInsurance();
}
