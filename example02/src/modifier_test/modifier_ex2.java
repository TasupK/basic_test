package modifier_test;

public class modifier_ex2 {
	
	int A; // �ν��Ͻ� ���
	int B;
	
	int add() {
		return A+B;
	} // �ν��Ͻ� �޼ҵ�
	
	static int add2(int A, int B) { //��������
		return A+B;
	} // ����ƽ �޼ҵ�
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(modifier_ex2.add2(1, 2));
		
		modifier_ex2 add = new modifier_ex2();
		add.A = 1;
		add.B = 2;
		System.out.println(add.add());
		

	}

}
