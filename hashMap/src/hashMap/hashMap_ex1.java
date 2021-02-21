package hashMap;

import java.util.HashMap;

public class hashMap_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * map의 상위 오브젝트는 MAP
		 * 하위 오브젝트는 hashtable 과 hashmap 과 treemap
		 * map에는 순서가 없다. 순서가 있는 map은 Linkedhashmap
		 * hashmap에는 키와 값이 있다.
		 */

		HashMap<String, Object> map = new HashMap<String,Object>();
		HashMap map2 = new HashMap();
		map.put("hi", "안녕");
		map.put("bye","잘가");
		System.out.println(map);
		
		/*
		 * hashing이란 키 값을 넣으면 저장위치를 알려준다.
		 * 이 저장위치가 hashcode
		 * hashing함수라는 것은 저장하고 읽어오는 것.
		 * .containskey key값의 여부를 물어보는 것. (boolean)
		 * .get 해당 key값의 value를 가져오는 것.
		 * .put HashMap에 저장하는 것.
		 * 
		 */
		String hi = map.get("hi").toString();
		System.out.println(hi);
	}

}
