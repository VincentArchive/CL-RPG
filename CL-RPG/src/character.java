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
		
	}
	
	
}
