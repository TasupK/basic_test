package family;

public class Son extends Family implements Job{
	
	Son(){
		
	}
	Son(String name){
		super(name);
	}
	
	@Override
	public String work() {
		return "아들은 공부를 한다";
	}
	@Override
	public String toString() {
		return super.toString() + work();
	}
	
	
	

}
