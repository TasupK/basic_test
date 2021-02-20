package basic_test.test;

public class Test02 {
	/*
	 * float 변수를 만들고 75.3
	 * double 변수를 만들고 89.53을 각각 대입 한 후
	 * System.out.println();를 한번만 사용하여 출력하세요.
	 * 메인 메서드에 입력하고 콘솔로 출력해 주세요 ^^ 
	 * 
	 * --결과
	 * 국어점수는 75.3점이고
	 * 수학점수는 89.53점 입니다.
	 * 
	 * */
	public static void main(String[] args) {
		float number1 = 75.3f;
		double number2 = 89.53;
		System.out.printf("국어점수는 %.1f점이고\n수학점수는 %.2f점 입니다.",number1,number2);
	}

}
