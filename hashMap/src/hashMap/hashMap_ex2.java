package hashMap;

import java.util.HashMap;
import java.util.Scanner;


public class hashMap_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HashMap map = new HashMap();
	    map.put("myId", "1234");
	    map.put("asdf", "1111");
	    map.put("asdf", "1234");
	      
	    Scanner sc = new Scanner(System.in);
	    
	    while(true){
	    	System.out.println("ID�� �Է����ּ���:");
	    	String ID = sc.nextLine().trim();
	    	System.out.println("PW�� �Է����ּ���:");
	    	String PW = sc.nextLine().trim();
	    	
	    	if(!map.containsKey(ID)) {
	    		System.out.println("ID�� �������� �ʽ��ϴ�.");
	    		continue;
	    	}
	    	if(map.get(ID).equals(PW)){
	    		System.out.println("�α����� �Ǿ����ϴ�.");
	    	} else {
	    		System.out.println("�������� �ʽ��ϴ�.");
	    	}
	    	
	    }

	}

}
