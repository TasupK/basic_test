package family;

public class Father extends Family implements Job{
	
	
	Father(){
		
	}
	Father(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "�ƺ��� ������ �����Ѵ�";
	}
	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	
	

}
