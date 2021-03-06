package family;

public class MainEx {

	public static void main(String[] args) {
		
		
		Family [] family = new Family [] {
				new Father("È«±æµ¿"),new Mother("¼ÒÁ¤"), new Son("È«ÁØÇ¥")
		};
		
		System.out.println(family);
		
		
		for(Family ob : family) {
			System.out.println(ob);
		}
		
		
		/*for(int i=0; i<family.length; i++) {
			System.out.println(family[0]);
		} */
	}

}
