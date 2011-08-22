// importing user input scanner
import java.util.Scanner;

import java.io.File;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class createchar {
	
	Scanner input = new Scanner(System.in);
	String[] classes = null;
	int amountClasses;
	
	public createchar(){
		getClassData();
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
	}
	
	public void getClassData(){

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
}
