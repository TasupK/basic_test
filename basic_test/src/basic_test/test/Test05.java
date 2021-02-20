package basic_test.test;

import java.util.Scanner;
/*
 * 콘솔에 사용자가 값을 입력하면 
 * 짝수 인지 홀수인지 구분하는 프로그램을 만들어 주세요 
 * (삼항 연산자 사용) 
 * 
 * 예시)
 * 숫자를 입력해 주세요 
 * 22
 * 출력값은 "짝수" 입니다.
 * 
 * 
 */
public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
        int number = sc.nextInt();
		String isEven = (number%2==0)? "짝수" : "홀수";
		System.out.printf("출력값은 \"%s\" 입니다.",isEven);
	}

}
