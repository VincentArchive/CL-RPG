// importing user input scanner
import java.util.Scanner;

public class createchar {
	
	private String name;
	private String sclass;
	private int iclass;
	private int classCounter = 0;
	Scanner input = new Scanner(System.in);
	
	public void askName(){		
		System.out.println("Choose your name:");
		name = input.nextLine();
	}
	
	public void askClass(){	
		do{
			if(classCounter > 0){
				System.out.println("Error. Please enter number from 1-3.");
			}
			System.out.println("Choose your class:");
			System.out.println("1: Melee");
			System.out.println("2: Mage");
			System.out.println("3: Thief");
			sclass = input.nextLine();
			iclass = Integer.parseInt(sclass);
			classCounter++;
		}while(iclass != 1 && iclass != 2 && iclass != 3 );
			
	}
}
