

/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 7 JUNE 2019
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
		Cubicle[][] myBuilding = new Cubicle[7][20];
		holding = new Holding("DeV co", "Gonzalo De Varona", myBuilding);	

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
		System.out.println("2. Register surveys for a business.");
		System.out.println("3. Show businesses information.");
		System.out.println("4. Show how many businesses does the holding have.");
		System.out.println("5. QUIT PROGRAM");
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

		while (userInput != 5){

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


				//REGISTER SURVEYS FOR A BUSINESS
				case 2: 
					registerSurveys();
					break; 


				//SHOW BUSINESSES INFORMATION
				case 3: 
					businessesInfo();
					break; 


				//SHOW HOW MANY BUSINESSES DOES THE HOLDING HAVE
				case 4: 
					businessesQuantity(); 
					break;


				//QUIT PROGRAM
				case 5: 
					theGoodbye();
					break;

				default:
					break;
				
			}

		}

	}


	//FUNCTION METHODS

	public void registerANewBusiness() {


		System.out.println("");
		System.out.println("BUSINESS BASIC INFORMATION:");
		System.out.println("");
		System.out.print("Please type the business's full name: "); String name = reader.nextLine();
		System.out.print("Please type the business's nit: "); int nit = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the business's address: "); String address = reader.nextLine();
		System.out.print("Please type the business's phone: "); String phone = reader.nextLine();
		System.out.print("Please type how many employees the business has: "); int quantityEmployees = reader.nextInt(); reader.nextLine();
		System.out.print("Please type the business's assets (in COP): "); double assetsCop = reader.nextDouble(); reader.nextLine();
		System.out.print("Please type the business's legal representative name: "); String legalGuardiansName = reader.nextLine();

		System.out.println("");	
		System.out.println("Please select the type of organization for the business: "); 
		System.out.println("1. Farming, hunt, forestry and fishing");
		System.out.println("2. Explotation of mines and quarries");
		System.out.println("3. Manufacturing industry");
		System.out.println("4. Electricity, gas and steam");
		System.out.println("5. Construction");
		System.out.println("6. Wholesale and retail");
		System.out.println("7. Transportation, storage and communications");
		System.out.println("8. Financial statements, insurance, real estate, service to companies");
		System.out.println("9. Communal, social");
		System.out.println("");

		typeSelectionMssg();
		int choise = reader.nextInt(); reader.nextLine();
		plainLine();
		System.out.println("");
		String typeOfOrganization = "";

		switch (choise) { 
			case 1: typeOfOrganization = Business.FHFF;
				break;
			case 2: typeOfOrganization = Business.EMQ;
				break;
			case 3: typeOfOrganization = Business.MI;
				break;
			case 4: typeOfOrganization = Business.EGS;
				break;
			case 5: typeOfOrganization = Business.C;
				break;
			case 6: typeOfOrganization = Business.WR;
				break;
			case 7: typeOfOrganization = Business.TSC;
				break;
			case 8: typeOfOrganization = Business.FSIRES2C;
				break;
			case 9: typeOfOrganization = Business.CS;
				break;
			default:
				break;
		
			
		}

		ArrayList<Survey> surveys = new ArrayList<Survey>();

		if (!(typeOfOrganization.equals(""))) {

			if(!(name.equals("")) && (nit != 0) && !(address.equals("")) && !(phone.equals("")) && !(legalGuardiansName.equals(""))  ){

				System.out.print("Please type the business constitution date day: "); int day = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the business constitution date month: "); int month = reader.nextInt(); reader.nextLine();
				System.out.print("Please type the business constitution date year: "); int year = reader.nextInt(); reader.nextLine();
				
				Calendar today = new GregorianCalendar();
				int yearT = today.get(Calendar.YEAR);

				if (year <= yearT ) {
					DateIn openingDate = new  DateIn(day, month, year);
					System.out.print("Please type how many floors the business building has: "); int floors = reader.nextInt(); reader.nextLine();
					System.out.print("Please type how many cubicles the business building has per floor: "); int cubiclesPerFloor = reader.nextInt(); reader.nextLine();
					
					if (floors >= 3 && floors <= 7 && cubiclesPerFloor <= 20 ) {
						Cubicle[][] cubicles = new Cubicle[floors][cubiclesPerFloor];

						System.out.println("");	
						System.out.println("Please select the type of business (the first 3 are services businesses): "); 
						System.out.println("1. Technological");
						System.out.println("2. Education");
						System.out.println("3. Public services");
						System.out.println("4. Manufacturing");
						System.out.println("");

						typeSelectionMssg();
						int choiseBusiness = reader.nextInt(); reader.nextLine();
						plainLine();
						System.out.println("");
						
						switch (choiseBusiness) { 
							case 1:
								System.out.print("Please type how many kilowatts are consumed by the business: "); double kilowatts = reader.nextDouble(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a training service: "); int training = reader.nextInt(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a consulting service: "); int consulting = reader.nextInt(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a software development service: "); int softwareDevelopment = reader.nextInt(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a infrastructure service: "); int infrastructureService = reader.nextInt(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a software service: "); int software = reader.nextInt(); reader.nextLine();
								System.out.print("Please type how many times does the business has rendered a platform service: "); int platform = reader.nextInt(); reader.nextLine();
								
								Technological theNewT = new Technological(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles, surveys,
								kilowatts, consulting, training, softwareDevelopment, infrastructureService, software, platform);
								fillBuilding(theNewT);
								System.out.println("");
								System.out.println(holding.addBusiness(theNewT));
								System.out.println("");
								break;
							
							case 2:
								System.out.print("Please type approval MEN number: "); String approvalNumberMEN = reader.nextLine();
								System.out.print("Please type how many years as high quality entity does the business has : "); double yearsAsHighQuality = reader.nextDouble(); reader.nextLine();
								System.out.print("Please type the business position in SABER 11 national ranking: "); int nationalRanking11 = reader.nextInt(); reader.nextLine();
								System.out.print("Please type the business position in SABER PRO national ranking: "); int nationalRankingPro = reader.nextInt(); reader.nextLine();
								System.out.print("Please type the principals name: "); String principalsName = reader.nextLine();
								System.out.println("Please select the educational sector: "); 
								System.out.println("1. High school.");
								System.out.println("2. College.");

								typeSelectionMssg();
								int choiseSchool = reader.nextInt(); reader.nextLine();
								plainLine();
								String sector = "";

								switch (choiseSchool) {
									case 1: sector = Education.HIGHSCHOOL;
										break;
									case 2: sector = Education.COLLEGE;
										break;
									default:
										break;	
								}

								if (!(sector.equals(""))) {
									System.out.print("Please type how many students from stratums 1 and 2 the educational business has: "); int totalStudents1And2 = reader.nextInt(); reader.nextLine();
									System.out.print("Please type how many students in total the educational business has: "); int totalStudents = reader.nextInt(); reader.nextLine();
									
									Education theNewE = new Education (name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, 
									legalGuardiansName, cubicles, surveys, approvalNumberMEN, yearsAsHighQuality, nationalRanking11, nationalRankingPro, principalsName,
									sector, totalStudents1And2, totalStudents);
									fillBuilding(theNewE);
									System.out.println("");
									System.out.println(holding.addBusiness(theNewE));
									System.out.println("");

								} else {System.out.println("ERROR: Invalid selection");}

								
								

																															

								break;
							case 3:	
								System.out.println("Please select type of service rendered: "); 
								typeSelectionMssg();
								int choiseService = reader.nextInt(); reader.nextLine();
								plainLine();
								String serviceType = "";

								switch (choiseService) {
									case 1: serviceType = Public.SEWERAGE;
										break;
									case 2: serviceType = Public.ENERGY;
										break;
									case 3: serviceType = Public.AQUEDUCT;
										break;
									default:
										break;	
								}
								if (!(serviceType.equals(""))) {

									System.out.print("Please type how many subscribers from stratums 1 and 2 the business has: "); int subscribers1N2 = reader.nextInt(); reader.nextLine();
									System.out.print("Please type how many subscribers in total the business has: "); int totalSubscribers = reader.nextInt(); reader.nextLine();
									
									Public theNewP = new Public (name,  nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization,
									legalGuardiansName, cubicles, surveys, serviceType, totalSubscribers, subscribers1N2);

									fillBuilding(theNewP);

									System.out.println("");
									System.out.println(holding.addBusiness(theNewP));
									System.out.println("");
								
								} else {System.out.println("ERROR: Invalid selection");}
								

								break;
							case 4:
								Manufacturing theNewM = new Manufacturing (name,  nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization,
								legalGuardiansName, cubicles, surveys);


							

								System.out.print("How many products does the business manufacture?"); int numberProducts = reader.nextInt(); reader.nextLine();
								
								for (int i = 1 ; i<= numberProducts ; i++ ) {
									System.out.println("");
									System.out.println("PRODUCT #"+i);
									System.out.print("Please type the product's name: "); String nameProduct = reader.nextLine();
									System.out.print("Please type the product's code: "); String code = reader.nextLine();
									System.out.print("Please type how many litres of water the product needs to be manufactured: ");double waterRequired4Manufacturing = reader.nextDouble(); reader.nextLine();
									System.out.print("Please type how many units of the product are on the inventory: "); int unitsInventory = reader.nextInt(); reader.nextLine();
									System.out.println("Does your product require INVIMA(such as food or medicines)?"+i);
									System.out.println("1. Yes.");
									System.out.println("2. No.");

									typeSelectionMssg();
									int answer = reader.nextInt(); reader.nextLine();
									plainLine();
									Invima invima = null;

									switch (answer) {

										case 1:
											System.out.print("Please type the product's sanitary registration: "); String sanitaryRegistration = reader.nextLine();
											
											System.out.println("Please select its INVIMA mode: "); 
											System.out.println("1. Manufacture and export.");
											System.out.println("2. Manufacture and sell.");
											System.out.println("3. Import and sell.");

											typeSelectionMssg();
											int answer2 = reader.nextInt(); reader.nextLine();
											plainLine();
											String mode = "";
											
											switch (answer2) {
												case 1: 
													mode = Invima.MAE;
													break;
												case 2:
													mode = Invima.MAS;
													break;
												case 3:
													mode = Invima.IAS;
													break;
												default: 
													break;
											
											}

											if (!((mode.equals("")))) {
												System.out.print("Please type the INVIMA's expiration date month: "); int monthE = reader.nextInt(); reader.nextLine();
												System.out.print("Please type the INVIMA's expiration date year: "); int yearE = reader.nextInt(); reader.nextLine();
												
												DateIn dateE = new DateIn(0, monthE, yearE);

												System.out.println("Please select if its INVIMA still active: "); 
												System.out.println("1. Yes.");
												System.out.println("2. No.");

												typeSelectionMssg();
												answer = reader.nextInt(); reader.nextLine();
												plainLine();
												boolean status = false;

												switch (answer) {
													case 1:
														status = true;
														
													
														Invima invimaReala = new Invima(sanitaryRegistration, status, mode, dateE); 

														Product newProductIa = new Product(nameProduct, code, waterRequired4Manufacturing, unitsInventory, invimaReala);
														theNewM.addProduct(newProductIa);


														break;
													case 2:
														Invima invimaRealb = new Invima(sanitaryRegistration, status, mode, dateE); 

														Product newProductIb = new Product(nameProduct, code, waterRequired4Manufacturing, unitsInventory, invimaRealb);
														theNewM.addProduct(newProductIb);
														

														break;

													default:
														System.out.println(""); 
														System.out.println("ERROR: Invalid selection");
														System.out.println("");
													
												}

											} else{System.out.println("");
												System.out.println("ERROR: Invalid selection");
												System.out.println("");}

												





										

											

											break;
										case 2:
											
											Product newProduct = new Product(nameProduct, code, waterRequired4Manufacturing, unitsInventory, invima);
											theNewM.addProduct(newProduct);
											break;
										default:
											System.out.println("ERROR: Invalid selection");
											break;
													
									} 

									
							}

								fillBuilding(theNewM);
								System.out.println("");
								System.out.println(holding.addBusiness(theNewM));
								System.out.println("");  
								

								break;

							default:
								System.out.println("");
								System.out.println("ERROR: Invalid selection");
								System.out.println("");
								break;	
						} 


							
					} else{System.out.println("");
						System.out.println("ERROR: Invalid building");
						System.out.println("");}
					
				

				} else{System.out.println("");
					System.out.println("ERROR: Invalid date");
					System.out.println("");}

			}else{System.out.println("");
				System.out.println("ERROR: Missing information");
				System.out.println("");}	

			


		} else{System.out.println("");
			System.out.println("ERROR: Invalid selection");
			System.out.println("");}

	

			

		
	}




	public void registerSurveys(){
		System.out.println("Please type the nit of the business to register the surveys:");
		System.out.print("NIT: ");int nit = reader.nextInt(); reader.nextLine();
		System.out.println("");

		Business found = holding.findBusiness(nit);

		if (found != null) {
			System.out.print("How many surveys are going to be registered? "); int many = reader.nextInt(); reader.nextLine();


			for (int i = 1; i<=many; i++ ) {
				System.out.println("");
				System.out.println("SURVEY #"+i);
				System.out.println("From 1-5, starting with 1 as not satisfied and ending with 5 as very satisfied, please answer this 3 questions:");
				System.out.print("1. Service rendered: "); int questionA = reader.nextInt(); reader.nextLine();
				System.out.print("2. Answer time: "); int questionB = reader.nextInt(); reader.nextLine();
				System.out.print("3. Cost/benefict relationship from the service rendered: "); int questionC = reader.nextInt(); reader.nextLine();
				
				if (questionA >= 1 && questionA <= 5 && questionB >= 1 && questionB <= 5 && questionC >= 1 && questionC <= 5) {
					Survey survey = new Survey(questionA, questionB, questionC);
					System.out.println("");
					System.out.println(found.addSurvey(survey));
					System.out.println("");

				} else {System.out.println("");
					System.out.println("ERROR: Invalid selection");
					System.out.println("");
				}
												
				
			}
			
		} else {System.out.println("");
			System.out.println("ERROR: No business found");
			System.out.println("");}

	}


	public void businessesInfo(){

		//TODO


	}


	
	public void businessesQuantity(){
		if (holding.businessCounter() ==1) {
			System.out.println("");
			System.out.println(holding.getName()+" has "+holding.businessCounter()+" business.");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println(holding.getName()+" has "+holding.businessCounter()+" businesses.");
			System.out.println("");
		}
		
	}


	public void theGoodbye() {
		System.out.print("\033[H\033[2J");  
		System.out.flush(); 
		System.out.println("");
		System.out.println("THANK YOU FOR USING HOLDINGS.co SOFTWARE");
		System.out.println("");
	}


	public void fillBuilding(Business business){
		Cubicle[][] building = business.getCubicles();



		int everyone = building.length * building[0].length;
		System.out.println(everyone);
		System.out.println("NOTE: Cubicle's information can be overrided. *Extension number is obligatory*");

		
		for (int i = 1 ; i <= everyone ;i++ ) {
			System.out.println("");
			System.out.println("CUBICLE #"+i);
			System.out.print("Please type the floor for the cubicle: "); int x = reader.nextInt(); reader.nextLine();
			System.out.print("Please type the number of cubicle for the new cubicle (in floor #"+x+"): "); int y = reader.nextInt(); reader.nextLine();
			System.out.println("");

			if(building[x-1][y-1] != null && !(building[x-1][y-1].getName().equals("")) ){
				System.out.println("");
				System.out.println("NOTE: This cubicle will be overriden.");
				System.out.println("");
			}

			System.out.print("Please type the name of the employee for the cubicle: "); String name = reader.nextLine();
			System.out.print("Please type the position of the employee for the cubicle: "); String position = reader.nextLine();
			System.out.print("Please type the email of the employee for the cubicle: "); String email = reader.nextLine();
			System.out.print("*Please type extension for the cubicle: "); String extension = reader.nextLine();

			if (!(extension.equals(""))) {

				Cubicle cubicle = new Cubicle(name, position, email, extension);
				building[x-1][y-1] = cubicle;

			} else {System.out.println("");
				System.out.println("ERROR: This cubicle cannot be created, extension is missing");
				System.out.println("");
			}
		
		}

	}
						


} //end of class