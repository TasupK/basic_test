package basic_test.test;

public class Test01 {
	/*
	 * 각각 변수를 만들고 값을 대입하여 결과를 출력하세요.
	 * 메인 메서드에 입력하고 콘솔로 출력해 주세요 ^^ 
	 * (이름, 성별, 입사점수)
	 * 출력---
	 * 내 이름은 강호동이며 성별은 남자이고
	 * 입사성적은 85.35점 입니다.
	 * 
	 * */
	public static void main(String[] args) {
		String name = "김태섭"; 
		String gender = "남자";
		String grade = "85.35";
		System.out.printf("내 이름은 %s이며 성별은 %s이고\n입사성적은 %s점 입니다.", name,gender,grade);
		
	}

}
