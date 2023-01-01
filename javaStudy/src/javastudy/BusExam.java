package javastudy;

public class BusExam {
	
	public static void main(String[] args) {
		
//		Bus bus = new Bus();
//		bus.run();
		
		Car c = new Bus();
//		c.bbangbbang();			//부모타입으로 자식을 가르키고 있어서 자식이 가지고 있는 메서드를 사용할 수 없음
		
		Bus bus = (Bus) c;
		bus.run();
		bus.bbangbbang();
		
	}

}