package javastudy;

public class Car {
	
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
//		System.out.println("Car의 기본 생성자 입니다.");
		
	}
	
	public Car() {
		this.name = "이름없음";
		this.number = 0;
//		this("이름없음",0);
	
//		System.out.println("Car의 기본 생성자 입니다.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("Car's run method");
	}
		
}
