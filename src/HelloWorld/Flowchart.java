package HelloWorld;

public class Flowchart {

	public static void main(String[] args) {
		System.out.println(flow(3000));
	}
	
	public static String flow(int a) {
		if (a>6000) {
			System.out.println("C"); 
		}else if (a>4000) {
			System.out.println("D");
		}else if (a<4000 && a>2000){
			System.out.println("E");
		}else if (a>2000) {
			System.out.println("A");
		}else if (a < 100) {
			System.out.println("2");
		}else if (a<500 && a>100) {
			System.out.println("7");
		}else if (a>500 && a<600) {
			System.out.println("6");
		}else if (a>100 && a>500) {
			System.out.println("");
		}
		return "End";
	}
	
	
	
	
}
