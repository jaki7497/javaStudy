package javastudy;

public class MethodOverloadExam {
	
	public static void main(String[] args) {
		
		MyClass2 m = new MyClass2();
		
		System.out.println(m.plus(4, 5));
		System.out.println(m.plus(5, 8, 9));
		System.out.println(m.plus("hello", " world"));
	}

}
