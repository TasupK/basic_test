package hashMap;

import java.util.HashMap;

public class hashMap_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * map�� ���� ������Ʈ�� MAP
		 * ���� ������Ʈ�� hashtable �� hashmap �� treemap
		 * map���� ������ ����. ������ �ִ� map�� Linkedhashmap
		 * hashmap���� Ű�� ���� �ִ�.
		 */

		HashMap<String, Object> map = new HashMap<String,Object>();
		HashMap map2 = new HashMap();
		map.put("hi", "�ȳ�");
		map.put("bye","�߰�");
		System.out.println(map);
		
		/*
		 * hashing�̶� Ű ���� ������ ������ġ�� �˷��ش�.
		 * �� ������ġ�� hashcode
		 * hashing�Լ���� ���� �����ϰ� �о���� ��.
		 * .containskey key���� ���θ� ����� ��. (boolean)
		 * .get �ش� key���� value�� �������� ��.
		 * .put HashMap�� �����ϴ� ��.
		 * 
		 */
		String hi = map.get("hi").toString();
		System.out.println(hi);
	}

}
