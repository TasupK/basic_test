package abstracttest;

abstract class cat {
	abstract void call();

}

class FirstCat extends cat implements cat2{
	void call() {
		System.out.println("ù��° �߿���");
	}
	public void skil() {
		System.out.println("������");
		
	}
	
}
class SecondCat extends cat implements cat2{
	void call() {
		System.out.println("�ι�° �߿���");
	}
	
	public void skil() {
		System.out.println("������");
		
	}
	
}
