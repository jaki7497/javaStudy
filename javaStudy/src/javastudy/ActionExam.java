package javastudy;

public class ActionExam {

	public static void main(String[] args) {
		
//		Action action = new MyAction();
//		action.exec();
		Action action = new Action() {
			
			public void exec() {
				System.out.println("exec");
				
			}
		};
		action.exec();
	}

}
