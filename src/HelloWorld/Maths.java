package HelloWorld;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(8, 2));		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int prod(int a, int b) {
		return a*b;
		
	}
	
	public static int subtract(int a, int b) {
		return a-b;
	}
	
	public static double div(double a, double b) {
		if (a>b) {		
		return a / b;
		} else {
			System.out.println("Cannot be performed");
			return 0;
		}
	}
	
	
}

