package javastudy;

public class ArrayExam {

	public static void main(String[] args) {
		
		// 배열은 처음 할당한 크기에서 변하지 않음
		int[] array1 = new int[100];
		
		array1[0] = 50 ;
		array1[99] = 100;
		
		int[] array2 = new int[] {1,2,3,4,};
		
		int[] array3 = {1,2,3,4,};
		
		System.out.println(array3[3]);
		
		int value = array3[0];
		
		System.out.println(value);
	}

}
