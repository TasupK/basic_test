package VO;

import java.util.Scanner;

public class User {






	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", email=" + email + ", password=" + password + ", addr1=" + addr1
				+ ", addr2=" + addr2 + ", gender=" + gender + "]";
	}






	String user_id;
	String email;
	String password;
	String addr1;
	String addr2;
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}






	String gender;
	
	
	
	
	public User() {
		super();
	}
	
	public User(String user_id, String email, String password, String addr1, String addr2, String gender) {
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



	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// VO와DTO 는 같다 (Value Object, Data Transformation Object)
		// 인스턴스가 생성될 때 마다, 호출되는 인스턴스 초기화 메소드를 생성자라 한다.
		User user = new User();	
		user.setPassword("5678");
		String userPassword =user.getPassword();
		user.setUser_id("se");
		String User_id = user.getUser_id();
		user.setEmail("bbbb@gmail.com");
		String Email = user.getEmail();
		user.setAddr1("서울역");
		String Addr1 = user.getAddr1();
		user.setAddr2("이디야");
		String Addr2 = user.getAddr2();
		Scanner sc = new Scanner(System.in);
		String yas = sc.nextLine();
		
		if(yas.equals("m")) {
			user.setGender("남자");
		}else if(yas.equals("f")) {
			user.setGender("여자");
		}
		System.out.println(user.toString());
		
	}

}
