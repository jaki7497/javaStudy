package javastudy;

public class BusExam {
	
	public static void main(String[] args) {
		
//		Bus bus = new Bus();
//		bus.run();
		
		Car c = new Bus();
//		c.bbangbbang();			//�θ�Ÿ������ �ڽ��� ����Ű�� �־ �ڽ��� ������ �ִ� �޼��带 ����� �� ����
		
		Bus bus = (Bus) c;
		bus.run();
		bus.bbangbbang();
		
	}

}