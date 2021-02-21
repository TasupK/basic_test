package string1;

public class String_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String p = "100";
		int a = Integer.parseInt(p);
		System.out.println(a);
		String q;
		String r;
		q = Integer.toString(a);
		r = String.valueOf(a);
		System.out.println("q :"+q);
		System.out.println("r :"+r);
		
		/*
		 * 자바에서 제공되는 모든 클래스는 계층 구조로 되어있다.
		 * 일반적으로, 생성하는 클래스는 (오브젝트는)직접 상속하진 않지만
		 * 자바 컴파일러가 일반 클래스를 오브젝트 하위 클래스로 자동 설정을 한다.
		 * 모든 클래스는 오브젝트 클래스를 상속받는다.
		 * 오브젝트 클래스에는 toString 메소드가 있으며, 객체가 가지고 있는 정보나 값들을
		 * 모두 문자로 만들어버린다.
		 * 모든 클래스에서 사용할 수 있다.
		 */
	}

}
