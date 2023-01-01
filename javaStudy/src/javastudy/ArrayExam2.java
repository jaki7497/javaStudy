package javastudy;

public class ArrayExam2 {
	
	public static void main(String[] args) {
		
		int[][] array4 = new int[3][4];
		
		array4[0][1] = 10;
		
		int[][] array5 = new int[3][];
		
		array5[0] = new int[1];
		array5[0][0] = 10;
		
//		System.out.println(array5[0][0]);

		for (int[] value:array5) {
			System.out.println(value);
		}
	}
}
