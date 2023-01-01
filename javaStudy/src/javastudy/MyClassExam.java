package javastudy;

public class MyClassExam {
	
	public static void main(String[] args) {
		
		MyClass myclass = new MyClass();
		
		myclass.method1();
		
		myclass.method2(8);
		
		int value = myclass.method3();
		System.out.println(value);

		myclass.method4(4, 6);
		
		int value2 = myclass.method5(9);
		System.out.println(value2);
	}

}
