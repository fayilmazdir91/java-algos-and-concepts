package insuranceManagementSystem;

import java.util.ArrayList;
import java.util.Date;

public class User{
	String name, surname, email, password, job;
	int age;
	ArrayList<Address> adressList;
	Date lastEntry;
	
	public User(String name, String surname, String email, String password, String job, int age,
			ArrayList<Address> adressList, Date lastEntry) {
		super();
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.password = password;
		this.job = job;
		this.age = age;
		this.adressList = adressList;
		this.lastEntry = lastEntry;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public ArrayList<Address> getAdressList() {
		return adressList;
	}
	public void setAdressList(ArrayList<Address> adressList) {
		this.adressList = adressList;
	}
	public Date getLastEntry() {
		return lastEntry;
	}
	public void setLastEntry(Date lastEntry) {
		this.lastEntry = lastEntry;
	}
	
	
}
