package HelloWorld;

public class Conditionals {

	public static void main(String[] args) {
		System.out.println(cond(1,2,true));
	}
	
	public static int cond(int a, int b, boolean c) {
		if (c == true) {
			return a+b;
		} else if(c == false){
			return a*b;
	;
		}
		return 0;
	}
}
