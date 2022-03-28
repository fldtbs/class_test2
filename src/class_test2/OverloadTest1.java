package class_test2;

public class OverloadTest1 {
	
	int a;
	int b;
	
	public int sum( ) {
		
		int sum = a+b;
		
		return sum;
	}
	
	public int sum(int a, int b) {
		
		int sum = a+b;
		
		return sum;
	}
	
	public int sum(double a, double b) {
		
		int sum = (int)a+(int)b;
		
		return sum;
	}

}
