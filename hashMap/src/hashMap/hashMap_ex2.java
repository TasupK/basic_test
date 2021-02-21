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
	    	System.out.println("ID를 입력해주세요:");
	    	String ID = sc.nextLine().trim();
	    	System.out.println("PW를 입력해주세요:");
	    	String PW = sc.nextLine().trim();
	    	
	    	if(!map.containsKey(ID)) {
	    		System.out.println("ID가 존재하지 않습니다.");
	    		continue;
	    	}
	    	if(map.get(ID).equals(PW)){
	    		System.out.println("로그인이 되었습니다.");
	    	} else {
	    		System.out.println("존재하지 않습니다.");
	    	}
	    	
	    }

	}

}
