package in.formidoboi.home_bakery.model;

import java.util.Comparator;

public abstract class UserEntity{
	
	private int id;
	private String fName;
	private String sName;
	private String email;
	private String password;
	private boolean isActive = true;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", sName=" + sName + ", email=" + email + ", password="
				+ password + ", isActive=" + isActive + "]";
	}
	
	public String fullName () {
		return fName.concat(" ").concat(sName);
	}
	
}
