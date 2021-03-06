package pkg2;

import pkg1.Myparent;

class MyChild extends Myparent{
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyparenteTest2 {
	public static void main(String[] args) {
		Myparent p = new Myparent();
		System.out.println(p.prv);
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
	}

}
