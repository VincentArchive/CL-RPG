import java.util.Scanner;


public class menu {
	


	public static void showMenu() {
		int optionInt = 0;
		Scanner input = new Scanner(System.in);


		boolean Bln = true;
		do {
			Bln = true;
			System.out.println("What do you want to do?");
			System.out.println("1. Show stats");
			System.out.println("2. Show skills");
			System.out.println("3. Fight monsters!");
			String option = input.nextLine();
			
			// probeer om string Userclass om te zetten naar integer
			try  
			   {  
				optionInt = Integer.parseInt( option );  
			   }  
			// als converteren niet lukt, geef error, zen Bln op false ( hierdoor wordt while opnieuw uitgevoert )
			catch( Exception e)  
			   {  
				   System.out.println("Geen getal gekozen.");
				   Bln = false;
			   }
			// als bij vorige stap geen error gebeurt ( Bln nog steeds true )
			// kijk of classInt tussen 1 en amountClasses ligt, zo niet zet bln op false waardoor while opnieuw uitgevoert
			if(Bln = true){
				if(optionInt < 1 || optionInt > 3){
					System.out.println("Gekozen getal ligt niet tussen 1 en 3.");
					Bln = false;
				}
			}
		}
		while(Bln == false);
		
		if(optionInt == 1){
			character.showStats();
			showMenu();
		}else if(optionInt == 2){
			showMenu();
		}else if(optionInt == 3){
			showMenu();
		}
		
	}
	
	public static void pauseProg(){
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
		for(int i=0;i < 10; i++){
			System.out.println("");
		}
	}

}
