package modifier_test;

public class modifier_ex2 {
	
	int A; // 인스턴스 멤버
	int B;
	
	int add() {
		return A+B;
	} // 인스턴스 메소드
	
	static int add2(int A, int B) { //지역변수
		return A+B;
	} // 스태틱 메소드
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(modifier_ex2.add2(1, 2));
		
		modifier_ex2 add = new modifier_ex2();
		add.A = 1;
		add.B = 2;
		System.out.println(add.add());
		

	}

}
