package javastudy;

public class Car {
	
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
//		System.out.println("Car�� �⺻ ������ �Դϴ�.");
		
	}
	
	public Car() {
		this.name = "�̸�����";
		this.number = 0;
//		this("�̸�����",0);
	
//		System.out.println("Car�� �⺻ ������ �Դϴ�.");
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("Car's run method");
	}
		
}
