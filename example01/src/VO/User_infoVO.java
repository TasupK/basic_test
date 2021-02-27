package VO;

public class User_infoVO {
	
	String user_id;
	String email;
	String password;
	String addr1;
	String addr2;
	String gender;
	
	public User_infoVO() {
		super();
	}
	
	public User_infoVO(String user_id, String email, String password, String addr1, String addr2, String gender) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.password = password;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.gender = gender;
	}

	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", gender=" + gender + "]";
	}


}
