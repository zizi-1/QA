package HelloWorld;
import java.util.Scanner;
public class Results {
				
	
	
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		System.out.println("Enter your Physics score: ");
		int phys = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter your Biology score: ");
		int bio = input2.nextInt();
		
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter your Chemistry score: ");
		int chem = input3.nextInt();
		
		System.out.println("Physics grade: "+phys);
		System.out.println("Biology grade: "+bio);
		System.out.println("Chemistry grade: "+chem);
		System.out.println("Total grade: " + sum(phys,bio,chem));
		System.out.println("Percentage: " + percent(phys,bio,chem));
		System.out.println("Result: "+result(phys,bio,chem));		
	}

	public static String result (double phys, double bio, double chem) {
		
		String failed = "You have failed: ";
		if ((phys /150 *100) < 60) {
			System.out.println(failed + "physics.");
		}
		if ((chem /150 *100) < 60) {
			System.out.println(failed + "chemistry.");
		}
		if ((bio /150 *100) < 60) {
			System.out.println(failed + "biology.");
		}
		if (percent(phys, chem, bio) < 60) {
			System.out.println("You have failed!");
		}
		if (percent(phys, chem, bio) >= 60 && (bio /150 *100) >= 60 && (chem /150 *100) >= 60 && (phys /150 *100) >= 60) {
			System.out.println("Well done! You passed");
		}
		return "";
		
		
		
		
		

	}

	
	public static double percent (double phys, double bio, double chem) {
		return ((phys+bio+chem)/450)*100;
	}
	
	public static double sum (double phys, double bio, double chem) {
		return phys+bio+chem;
	}
	
	
}
