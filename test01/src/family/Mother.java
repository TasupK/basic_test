package family;

public class Mother extends Family implements Job{
	
	Mother(){
		
	}
	Mother(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "������ �������� �Ѵ�";
	}
	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	
	

}
