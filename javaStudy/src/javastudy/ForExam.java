package javastudy;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i =1; i <= 100; i++) {
			if (i % 2 != 0) {
				continue;
			}
			total += i;
		}
		System.out.println(total);
	}

}
