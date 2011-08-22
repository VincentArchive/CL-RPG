// importing user input scanner
import java.util.Scanner;

public class createchar {
	
	Scanner input = new Scanner(System.in);
	
	public createchar(){		
		String name;
		String userClass;
		Integer classInt = 0;
		System.out.println("Choose your name:");
		name = input.nextLine();
		boolean Bln = true;
		do {
			Bln = true;
			System.out.println("Hi "+ name +"Choose your class:");
			System.out.println("1. Warrior");
			System.out.println("2. Mage");
			System.out.println("3. Thief");
			System.out.println("4. Healer3");
			userClass = input.nextLine();
			
			// probeer om string Userclass om te zetten naar integer
			try  
			   {  
				classInt = Integer.parseInt( userClass );  
			   }  
			// als converteren niet lukt, geef error, zen Bln op false ( hierdoor wordt while opnieuw uitgevoert )
			catch( Exception e)  
			   {  
				   System.out.println("Geen getal gekozen.");
				   Bln = false;
			   }
			// als bij vorige stap geen error gebeurt ( Bln nog steeds true )
			// kijk of classInt tussen 1 en 4 ligt, zo niet zet bln op false waardoor while opnieuw uitgevoert
			if(Bln = true){
				if(classInt < 1 || classInt > 4){
					System.out.println("Gekozen getal ligt niet tussen 1 en 4.");
					Bln = false;
				}
			}
		}
		while(Bln == false);
	}
}
