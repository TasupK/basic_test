package string1;

public class String_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * string.equlas
		 * string.substring
		 * stirng.length
		 */
		String a = "abcde";
		String temp = a.substring(1,4);
		System.out.println(temp);
		String b = "2021��02��21��";
		String year = b.substring(0,4);
		String month = b.substring(5,7);
		String day = b.substring(8, 10);
		System.out.println(year + month + day);
		String name = "������";
		name = name.replace('��', '��');
		System.out.println(name);
		String c = "abcd";
		if (a.equals(c)) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�ٸ��ϴ�.");
		}
	}

}
