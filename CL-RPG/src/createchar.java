// importing user input scanner
import java.util.Scanner;

public class createchar {
	
	private String name;
	Scanner input = new Scanner(System.in);
	
	public void askInfo(){		
		System.out.println("Choose your name:");
		name = input.nextLine();
		System.out.println(name);
	}
}
