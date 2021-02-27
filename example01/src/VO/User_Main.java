package VO;

public class User_Main {

	public static void main(String[] args) {
		User_infoVO vo = new User_infoVO();
		vo.setUser_id("se");
		vo.setPassword("123");
		vo.setEmail("mmm@gmail.com");
		vo.setAddr1("수원역");
		vo.setAddr2("탐앤탐스");
		vo.setGender("f");
		
		String User_id = vo.getUser_id();
		String Password = vo.getPassword();
		String Email = vo.getEmail();
		String Addr1 = vo.getAddr1();
		String Addr2 = vo.getAddr2();
		String gender = vo.getGender();
		
		if (gender.equals("m")) {
			vo.setGender("남자");
		} else if (gender.equals("f")) {
			vo.setGender("여자");
		}
		
		System.out.println(vo);
		
		// TODO Auto-generated method stub
		
		// VO는 자바 내에서 일종의 저장소 역할, get과 set은 저장소가 동적으로 움직이게 도와준다.

	}

}
