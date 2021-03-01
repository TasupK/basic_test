package inheritage_ex;


class TV{
	boolean Power;
	int Channel;
	void power() {Power = !Power;} 
	void ChanelUp() {++Channel;}
	void ChanelDown() {--Channel;}
	
}

class Smart_TV extends TV{
	boolean Caption;
	void displayCaption(String text) {
		if (Caption) {
			System.out.println(text);
		}
	}
	
	
}


public class inheritage_ex2 {
	public static void main(String[] args) {
		Smart_TV tv = new Smart_TV();
		tv.Power= true;
		tv.Channel = 10;
		tv.Caption = true;
		System.out.println(tv.Power);
		System.out.println(tv.Channel);
		System.out.println(tv.Caption);
		tv.displayCaption("Hello");
		tv.ChanelUp();
		tv.power();
		System.out.println(tv.Power);
		System.out.println(tv.Channel);
		TV tv2 = new Smart_TV(); 
        tv2.Channel=25;
		tv2.ChanelUp();
		System.out.println(tv2.Channel);
       
		
	}

}
