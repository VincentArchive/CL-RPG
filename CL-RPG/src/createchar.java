// importing user input scanner
import java.util.Scanner;

public class createchar {
	
	private String name;
	private String uclass;
	Scanner input = new Scanner(System.in);
	
	public void askName(){		
		System.out.println("Choose your name:");
		name = input.nextLine();
	}
	
	public void askClass(){		
		System.out.println("Choose your class:");
		System.out.println("1: Melee");
		System.out.println("2: Mage");
		System.out.println("3: Thief");
		uclass = input.nextLine();
	}
}
