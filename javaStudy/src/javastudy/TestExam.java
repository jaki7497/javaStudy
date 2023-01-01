package javastudy;

import java.util.Scanner;

public class TestExam {
	
	public static int solution (int n) {
		
		int answer = 0;
		
		if (n<0 || n>3000) {
			System.out.println("n�� 0�̻� 3000 ������ �ڿ��� �Դϴ�.");
		} else {
			for (int i=1; i<=n; i++) {
				if (n%i == 0) {
					answer += i;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a = solution(number);
		
		System.out.println(a);
	}

}
