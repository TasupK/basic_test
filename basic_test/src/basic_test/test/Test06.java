package basic_test.test;

public class Test06 {
	// 두배열이 같은지 출력하는 코드를 작성해 주세요 
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		int errPoint = 0;
		
		if(arr1.length != arr2.length) {
			errPoint = 1;
		} else {
			for(int i=0; i<arr1.length; i++) {
				if (arr1[i] != arr2[i]) {
				errPoint = 1;
			}
		}
		}
		
		if(errPoint == 1) {
			System.out.println("다릅니다.");
		} else {
			System.out.println("같습니다.");
		}

	}
}
