import java.util.Scanner;

public class character {
	static String name;
	static int classID;
	static int strength;
	static int stamina;
	static int inteligence;
	static int spirit;
	static int physresitance;
	static int magicresitance;
	
	
	public  character(String[] userData){
		name = userData[0];
		classID = Integer.parseInt( userData[1] ); 
		strength = Integer.parseInt( userData[2] ); 
		stamina = Integer.parseInt( userData[3] ); 
		inteligence = Integer.parseInt( userData[4] ); 
		spirit = Integer.parseInt( userData[5] ); 
		physresitance = Integer.parseInt( userData[6] ); 
		magicresitance = Integer.parseInt( userData[7] ); 
		System.out.println("Welcome "+ name);
		showStats();
		showMenu();
	}
	
	public static void pauseProg(){
		System.out.println("Press enter to continue...");
		Scanner keyboard = new Scanner(System.in);
		keyboard.nextLine();
		for(int i=0;i < 10; i++){
			System.out.println("");
		}
	}
	
	public static void showStats(){
		for(int i=0;i < 10; i++){
			System.out.println("");
		}
		System.out.println("Your stats are");
		if(strength != 0){System.out.println("strength "+ strength); }
		if(stamina != 0)System.out.println("stamina "+ stamina);
		if(inteligence != 0)System.out.println("inteligence "+ inteligence);
		if(spirit != 0)System.out.println("spirit "+ spirit);
		if(physresitance != 0)System.out.println("physresitance "+ physresitance);
		if(magicresitance != 0)System.out.println("magicresitance "+ magicresitance);
		pauseProg();
	}
	
	public static void showMenu(){
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
			showStats();
			showMenu();
		}else if(optionInt == 2){
			showMenu();
		}else if(optionInt == 3){
			showMenu();
		}
	}
	
	
}
