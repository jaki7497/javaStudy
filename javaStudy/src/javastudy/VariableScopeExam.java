package javastudy;

public class VariableScopeExam {
	
	int globalScope = 10;
	
	public void scopeTest(int value) {
		
		int localScope = 20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
			
	}

}
