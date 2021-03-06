package pkg1;

public class Myparent { //접근 제어자 default
	private int prv; // 같은 클래스
	int dft; // 같은 패키지
	protected int prt; // 같은 패키지 + 자손 (다른 패키지)
	public int pub; // 접근 제한이 없음
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}


class MyparentTest{
	public static void main(String[] args) {
		Myparent p = new Myparent();
		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}
}