package abstracttest;

abstract class cat {
	abstract void call();

}

class FirstCat extends cat implements cat2{
	void call() {
		System.out.println("첫번째 야옹이");
	}
	public void skil() {
		System.out.println("할퀴기");
		
	}
	
}
class SecondCat extends cat implements cat2{
	void call() {
		System.out.println("두번째 야옹이");
	}
	
	public void skil() {
		System.out.println("물어뜯기");
		
	}
	
}
