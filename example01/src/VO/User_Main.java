package VO;

public class User_Main {

	public static void main(String[] args) {
		User_infoVO vo = new User_infoVO();
		vo.setUser_id("se");
		vo.setPassword("123");
		vo.setEmail("mmm@gmail.com");
		vo.setAddr1("������");
		vo.setAddr2("Ž��Ž��");
		vo.setGender("f");
		
		String User_id = vo.getUser_id();
		String Password = vo.getPassword();
		String Email = vo.getEmail();
		String Addr1 = vo.getAddr1();
		String Addr2 = vo.getAddr2();
		String gender = vo.getGender();
		
		if (gender.equals("m")) {
			vo.setGender("����");
		} else if (gender.equals("f")) {
			vo.setGender("����");
		}
		
		System.out.println(vo);
		
		// TODO Auto-generated method stub
		
		// VO�� �ڹ� ������ ������ ����� ����, get�� set�� ����Ұ� �������� �����̰� �����ش�.

	}

}
