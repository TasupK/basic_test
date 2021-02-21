package string1;

public class String_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* string은 하나의 클래스이고, 문자열이란 문자의 나열이다.
		 * 자바의 string 클래스는 , char 배열을 선언하고 + 하나의 메서드이다.
		 * 
		 * a(0x300) -> "a"*
		 */
		String a = "a";
		String b = "b";
		a = a+b;
		System.out.println(a); // string 클래스는 내용을 변경할 수 없다. 단지 읽을 뿐.
		
	}

}
