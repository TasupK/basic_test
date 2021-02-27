package list_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Collection_ex {

	/* Collection Framework
	 * ��Collection Interface
	 *  ��list
	 *  ��set
	 * list�� ������ �ߺ��� �ִ�.
	 * set�� ������ ���� �ߺ��� �ȵȴ�.
	 * map�� ������ ������ Ű�� �ߺ��� �ȵǰ�, ���� �ߺ��� �ȴ�.
	 * interface�� �޼ҵ�
	 * add(), remove(), size(), sort()
	 * contains() = �ش� ���� ���ԵǾ� �ִ��� Ȯ��
	 * containsAll()
	 * retainAll() = �������ִ� ���� �����ϰ� �������� �����Ѵ�.
	 * list
	 * ��arraylist
	 * ��linkedlist
	 * add(), get(), set(), indexOf(), lastIndex(), remove(), sublist(),
	 * 
	 */

	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();

		arr1.add(5);
		arr1.add(4);
		arr1.add(2);
		arr1.add(0);
		//arr1.add(new Integer(9));
		arr1.add(1);
		arr1.add(3); //AutoBoxing �����Ϸ��� arraylist�� ��ü�� �ٲ㼭 �־��ش�.

		ArrayList arr2 = new ArrayList(arr1.subList(1, 4));
		print(arr1, arr2);
		Collections.sort(arr1);
		Collections.sort(arr2);
		print(arr1, arr2);
		System.out.println(arr1.containsAll(arr2));
		arr2.add("a");
		arr2.add("B");
		arr2.add(3,"C");
		print(arr1,arr2);
		arr2.add(3, "AA");
		print(arr1,arr2);
		System.out.println(arr1.retainAll(arr2));
		print(arr1,arr2);
		
		for(int i=arr2.size()-1; i>=0; i--) {
			if (arr1.contains(arr2.get(i))) {
				arr2.remove(i);
			}
		}
		print(arr1,arr2);
		arr2.remove("C");
		
		print(arr1,arr2);
	
	}
	
	static void print(ArrayList arr1, ArrayList arr2){
		System.out.println("Arr1 :" +arr1);
		System.out.println("Arr2 :" +arr2);
		System.out.println();
	}

}
