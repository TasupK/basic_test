package family;

public class Son extends Family implements Job{
	
	Son(){
		
	}
	Son(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "�Ƶ��� ���θ� �Ѵ�";
	}
	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	
	

}
