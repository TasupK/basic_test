package inheritage_ex;



public class inheritage_ex1 {
	
	/* ����� ���� Ŭ������ ���ο� Ŭ������ �ۼ��ϴ� �� (�ڵ��� ����)
	 * �� Ŭ������ �θ�� �ڽ��� ����� ����� ��
	 * class �ڽ�Ŭ������ extends �θ�Ŭ���� {
	 * }
	 * 
	 * �ڼ��� ������ ��� ����� ��� �޴´�.
	 * �ڼ��� ��� ������ ���󺸴� ���� �� ����.
	 * �ڹٴ� ���� ��Ӹ��� ���ȴ�.
	 * ����� �޾��� ���� ���� �޼ҵ尡 �����ϸ� 
	 * ��Ӱ� ���԰���(������)�� ������.
	 */

	class parents{
		int age;
		int name;
		int phonenumber;
		void run() {};
	}

	class child {
		parents pr = new parents();
		String childname;
	}

}
