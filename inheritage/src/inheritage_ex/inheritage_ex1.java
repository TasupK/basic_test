package inheritage_ex;



public class inheritage_ex1 {
	
	/* 상속은 기존 클래스로 새로운 클래스를 작성하는 것 (코드의 재사용)
	 * 두 클래스를 부모와 자식의 관계로 만드는 것
	 * class 자식클래스명 extends 부모클래스 {
	 * }
	 * 
	 * 자손은 조상의 모든 멤버를 상속 받는다.
	 * 자손의 멤버 개수는 조상보다 적을 수 없다.
	 * 자바는 단일 상속만이 허용된다.
	 * 상속을 받았을 때는 같은 메소드가 존재하면 
	 * 상속과 포함관계(생성자)로 나눈다.
	 */

	class parents{
		int age;
		int name;
		int phonenumber;
		void run() {};
	}

	class child {
		parents pr = new parents();
		String childname;
	}

}
