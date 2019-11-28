package HelloWorld;
import java.util.ArrayList;
public class Array {

	public static void main(String[] args) {

		ArrayList<String> numbers = new ArrayList<>( );
		
		for (int j=0;j<11;j++) {
			numbers.add(j+"|"+(j*10));
			System.out.println(numbers.get(j));
		}

		
	}	
}
	
