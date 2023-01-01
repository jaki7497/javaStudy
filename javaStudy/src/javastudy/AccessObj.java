package javastudy;

public class AccessObj {
	
	public int p = 3;		//public = 모든 접근 허용
	protected int p2 = 4;	//proteced = 겉운 패키지인 경우 접근 허용 , 자식 클래스 접근 허용
	int k = 2;				//default = 같은 패키지에서 접근 허용
	private int i = 3;		//private = 자기 자신만 접근 허용

}
