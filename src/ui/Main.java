

/*
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
* ID
* UNIVERSIDAD ICESI (CALI-COLOMBIA)
* DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
* LAB FOR VETERINARY MI PEQUENIA MASCOTA CODE
* @AUTHOR: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
* @LAST UPDATE DATE: 16 APRIL 2019
* ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
*/
package ui;



import model.*;
import java.util.*;

public class Main{

//ATTRIBUTES 
private Scanner reader;



//RELATIONSHIPS
private Holding holding;



//EMPTY CONSTRUCTOR
	public Main (){

		init ();
		reader = new Scanner(System.in);


	}



	public void init(){
		holding = new Holding("DeV co", "Gonzalo De Varona");	

	}




//  ******MAIN METHOD******
	public static void main(String[] args) {

		Main execute = new Main();
		execute.menu();	
	}




// *************************************INTERFACE'S METHODS*************************************

	public void showMenuOptions(){
		System.out.println("");
		System.out.println("1. Register a new business.");
		System.out.println("2. Show businesses information.");
		System.out.println("3. Show how many businesses does the holding have.");
		System.out.println("4. QUIT PROGRAM");
		System.out.println("");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("");
	}

	public void typeSelectionMssg() {	
		System.out.println("--------------------------------------");
		System.out.print("| Type the number of your selection: ");	
	} 


	public void plainLine(){
		System.out.println("--------------------------------------");
	}

	


	//************************ MAIN INTERFACE ************************
	public void menu(){
		int userInput = 0;

		System.out.println("");
		System.out.println("");

		//WELCOME 	
		     

		System.out.println(" _     _  _______  ___      _______  _______  __   __  _______    _______  _______    __   __  _______  ___      ______   ___   __    _  _______  _______        _______  _______ ");  
		System.out.println("| | _ | ||       ||   |    |       ||       ||  |_|  ||       |  |       ||       |  |  | |  ||       ||   |    |      | |   | |  |  | ||       ||       |      |       ||       |");  
		System.out.println("| || || ||    ___||   |    |       ||   _   ||       ||    ___|  |_     _||   _   |  |  |_|  ||   _   ||   |    |  _    ||   | |   |_| ||    ___||  _____|      |       ||   _   |");  
		System.out.println("|       ||   |___ |   |    |       ||  | |  ||       ||   |___     |   |  |  | |  |  |       ||  | |  ||   |    | | |   ||   | |       ||   | __ | |_____       |       ||  | |  |");  
		System.out.println("|       ||    ___||   |___ |      _||  |_|  ||       ||    ___|    |   |  |  |_|  |  |       ||  |_|  ||   |___ | |_|   ||   | |  _    ||   ||  ||_____  | ___  |      _||  |_|  |");  
		System.out.println("|   _   ||   |___ |       ||     |_ |       || ||_|| ||   |___     |   |  |       |  |   _   ||       ||       ||       ||   | | | |   ||   |_| | _____| ||   | |     |_ |       |");  
		System.out.println("|__| |__||_______||_______||_______||_______||_|   |_||_______|    |___|  |_______|  |__| |__||_______||_______||______| |___| |_|  |__||_______||_______||___| |_______||_______|");                                                                

		while (userInput != 4){

			showMenuOptions();

			System.out.println("--------------------------------------");
			System.out.print("| Type the number of your selection: ");
			userInput = reader.nextInt();
			reader.nextLine();
			System.out.println("--------------------------------------");

			switch (userInput) {

				//REGISTER A NEW BUSINESS
				case 1: 
					registerANewBusiness();
					break;

				//SHOW BUSINESSES INFORMATION
				case 2: 
					businessesInfo();
					break; 


				//SHOW HOW MANY BUSINESSES DOES THE HOLDING HAVE
				case 3: 
					businessesQuantity(); 
					break;


				//QUIT PROGRAM
				case 4: 
					theGoodbye();
					break;

				default:
					break;
				
			}

		}

	}

	public void registerANewBusiness() {
		System.out.println("");
		System.out.print("Please type the client's full name: "); String name = reader.nextLine();
		System.out.print("Please type the client's ID: "); String id = reader.nextLine();
		System.out.print("Please type the client's address: "); String address = reader.nextLine();
		System.out.print("Please type the client's phone number: "); String phone = reader.nextLine();
		System.out.println("");

		if(!(name.equals("")) && !(id.equals("")) && !(address.equals("")) && !(phone.equals(""))){

			Person theNew = new Person(name, id, address, phone);

			System.out.print("How many pets of the client are customers here?\n"); int loopsy = reader.nextInt(); reader.nextLine();

			ArrayList<Pet> clientsPets = new ArrayList<Pet>();

			for(int i = 0; i < loopsy; ++i){

				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------------------------------------------------");
				System.out.print("Please type the pet's full name: "); String petsName = reader.nextLine();
				System.out.println("");
				System.out.println("Please choose the pet's species: "); 
				System.out.println("1. Dog.");
				System.out.println("2. Cat.");
				System.out.println("3. Bird.");
				System.out.println("4. Other.");
				System.out.println("");
				typeSelectionMssg();
				int choise = reader.nextInt(); reader.nextLine();
				plainLine();
				System.out.println("");

				String species = goForIt.convertChoise2Type(choise);

				System.out.print("Please type the pet's age (years): "); double age = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.print("How much does the pet weight (Kg)? "); double weight = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.print("How tall is the pet (metres)? "); double height = reader.nextDouble(); reader.nextLine();
				System.out.println("");
				System.out.println("");

				

					if(species.equals("ERROR: Invalid species selection.")){
					System.out.println(species);
					--i;


					} else{ Pet theNewPet = new Pet(petsName, species, age, weight, height, theNew);
							clientsPets.add(theNewPet);
					}

				
			}
				

		


				
			
			goForIt.createPerson(theNew, clientsPets);
			System.out.println("*********************************************\n");
			System.out.println("* New business has been successfully added! *\n");
		 	System.out.println("*********************************************\n");

						

					} else{System.out.println("ERROR: Missing information.");}

		
			


		
	}



	public void businessesInfo(){

		System.out.println("");
		System.out.println(holding.showBusinessesInfo());
		System.out.println("");


	}


	
		public void businessesQuantity(){

		System.out.println("");
		System.out.println(holding.getName()+" owns " holding.businessesCounter(0) +"businesses in total."); 
		System.out.println("");
		
	}


	public void theGoodbye() {
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("");
		System.out.println("THANK YOU FOR USING HOLDINGS.co SOFTWARE");
		System.out.println("");
	}
						


} //end of class