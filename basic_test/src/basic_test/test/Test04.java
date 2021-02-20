package basic_test.test;
import java.util.Scanner;

public class Test04 {

	/*
	 * 콘솔에 사용자가 값을 입력하면 
	 * 두개의 합을 출력해주는 프로그램을 만들어 주세요 ^^ 
	 * 
	 * 예시)
	 * A값을 입력하세요 : 15
	 * B값을 입력하세요 : 10
	 * 15+10 = 25
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.printf("A값을 입력하세요 : ");
        int A = sc.nextInt();
        System.out.printf("B값을 입력하세요 : ");
        int B = sc.nextInt();
        System.out.printf("%d+%d = %d",A,B,A+B);
        
	}

}
