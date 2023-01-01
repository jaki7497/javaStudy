package javastudy;

public class MyCalTest {

	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		
		cal.plus(3, 4);
		int i = cal.exec(5, 9);		
		cal.multiple(3, 5);
		System.out.println(i);
		
		int j = Calculator.exec2(4, 2);
		System.out.println(j);

	}
	

}
