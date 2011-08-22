// importing user input scanner
import java.util.Scanner;

import java.io.File;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class createchar{
	
	Scanner input = new Scanner(System.in);
	String[] classes = null;
	String[] classData;
	int amountClasses;
	
	public createchar(){
		getClassName();
		
		String name;
		String userClass;
		Integer classInt = 0;
		System.out.println("Choose your name:");
		name = input.nextLine();
		boolean Bln = true;
		do {
			Bln = true;
			System.out.println("Hi "+ name +" choose your class:");
			for(int counter=0; counter < amountClasses; counter++){
				System.out.println( (counter+1) + ". " + classes[counter]);
			}
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
			// kijk of classInt tussen 1 en amountClasses ligt, zo niet zet bln op false waardoor while opnieuw uitgevoert
			if(Bln = true){
				if(classInt < 1 || classInt > amountClasses){
					System.out.println("Gekozen getal ligt niet tussen 1 en "+amountClasses+".");
					Bln = false;
				}
			}
		}
		while(Bln == false);
		
		getUserStats(classInt);
		
	}
	
	public void getClassName(){

		try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("src/resources/classdata.xml"));

            doc.getDocumentElement ().normalize ();

            NodeList listOfClasses = doc.getElementsByTagName("class");
            
            classes = new String[listOfClasses.getLength()];
            amountClasses = listOfClasses.getLength();
            String classID;
            String className;
            int classIDint;

            for(int s=0; s<listOfClasses.getLength() ; s++){


                Node firstPersonNode = listOfClasses.item(s);
                if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){


                    Element firstClassElement = (Element)firstPersonNode;
                    NodeList idList = firstClassElement.getElementsByTagName("id");
                    Element idElement = (Element)idList.item(0);
                    NodeList textLNList = idElement.getChildNodes();                    
                    classID =((Node)textLNList.item(0)).getNodeValue().trim(); 
                    
                    NodeList NameList = firstClassElement.getElementsByTagName("name");
                    Element NameElement = (Element)NameList.item(0);
                    NodeList textFNList = NameElement.getChildNodes();
                    className = ((Node)textFNList.item(0)).getNodeValue().trim();                    
                    classIDint = Integer.parseInt( classID ); 
                    
                    classes[classIDint] = className;


                }//end of if clause

                
            }//end of for loop with s var
            

        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        
		//System.exit (0);
        
	}
	
	public void getUserStats(int classIdChosen){

		try {
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("src/resources/classdata.xml"));

            doc.getDocumentElement ().normalize ();

            NodeList listOfClasses = doc.getElementsByTagName("class");

            String classID;
            int classIDint;
            String strength;
            String stamina;
            String inteligence;
            String spirit;
            String physresitance;
            String magicresitance;

            for(int s=0; s<listOfClasses.getLength() ; s++){


                Node firstPersonNode = listOfClasses.item(s);
                if(firstPersonNode.getNodeType() == Node.ELEMENT_NODE){


                    Element firstClassElement = (Element)firstPersonNode;
                    
                    NodeList idList = firstClassElement.getElementsByTagName("id");
                    Element idElement = (Element)idList.item(0);
                    NodeList textIdList = idElement.getChildNodes();                    
                    classID =((Node)textIdList.item(0)).getNodeValue().trim(); 
                    
                    classIDint = Integer.parseInt( classID ); 
                    
                    if(classIDint == classIdChosen){
                    	NodeList strengthList = firstClassElement.getElementsByTagName("strength");
                        Element strengthElement = (Element)strengthList.item(0);
                        NodeList textStrengthList = strengthElement.getChildNodes();                    
                        strength =((Node)textStrengthList.item(0)).getNodeValue().trim(); 
                        
                        NodeList staminaList = firstClassElement.getElementsByTagName("stamina");
                        Element staminaElement = (Element)staminaList.item(0);
                        NodeList textStaminaList = staminaElement.getChildNodes();                    
                        stamina =((Node)textStaminaList.item(0)).getNodeValue().trim(); 
                        
                        NodeList inteligenceList = firstClassElement.getElementsByTagName("inteligence");
                        Element inteligenceElement = (Element)inteligenceList.item(0);
                        NodeList textInteligenceList = inteligenceElement.getChildNodes();                    
                        inteligence =((Node)textInteligenceList.item(0)).getNodeValue().trim(); 
                        
                        NodeList spiritList = firstClassElement.getElementsByTagName("spirit");
                        Element spiritElement = (Element)spiritList.item(0);
                        NodeList textSpiritList = spiritElement.getChildNodes();                    
                        spirit =((Node)textSpiritList.item(0)).getNodeValue().trim(); 
                        
                        NodeList physresitanceList = firstClassElement.getElementsByTagName("physresitance");
                        Element physresitanceElement = (Element)physresitanceList.item(0);
                        NodeList textPhysresitanceList = physresitanceElement.getChildNodes();                    
                        physresitance =((Node)textPhysresitanceList.item(0)).getNodeValue().trim(); 
                        
                        NodeList magicresitanceList = firstClassElement.getElementsByTagName("magicresitance");
                        Element magicresitanceElement = (Element)magicresitanceList.item(0);
                        NodeList textMagicresitanceList = magicresitanceElement.getChildNodes();                    
                        magicresitance =((Node)textMagicresitanceList.item(0)).getNodeValue().trim(); 


                        classData = new String[]{strength, stamina, inteligence, spirit, physresitance, magicresitance};
                        
                        
                    }


                }//end of if clause

                
            }//end of for loop with s var
            

        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        
		//System.exit (0);
        
	}
	
	
}
