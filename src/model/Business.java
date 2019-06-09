/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 8 JUNE 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */
package model;

import java.util.*;


public class Business{

	//DOMAIN FOR TYPE OF ORGANIZATION
	public final static String FHFF = "Farming, hunt, forestry and fishing";
	public final static String EMQ = "Explotation of mines and quarries";
	public final static String MI = "Manufacturing industry";
	public final static String EGS = "Electricity, gas and steam";
	public final static String C = "Construction";
	public final static String WR =  "Wholesale and retail";
	public final static String TSC = "Transportation, storage and communications";
	public final static String FSIRES2C = "Financial statements, insurance, real estate, service to companies";
	public final static String CS = "Communal, social";



	//ATTRIBUTES

	private String name;
	private int nit;
	private String address;
	private String phone;
	private int quantityEmployees;
	private double assetsCop;
	private String typeOfOrganization;
	private String legalGuardiansName;

	//RELATIONSHIPS

	private DateIn openingDate;
	private Cubicle[][] cubicles;
	

	//METHODS

	public Business (String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles ) {

		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.quantityEmployees = quantityEmployees;
		this.assetsCop = assetsCop;
		this.openingDate = openingDate;
		this.typeOfOrganization = typeOfOrganization;
		this.legalGuardiansName = legalGuardiansName;
		this.cubicles = cubicles;
	}


	/**
	* Allows to get the business name. <br>
	* @return The business name
	*/

	public String getName(){
		return name;
	}


	/**
	* Allows to change the business name. <br>
	* <b>post:</b> The business name is changed. 
	* @param name The business name
	*/

	public void setName(String name){
		this.name = name;
	}


	/**
	* Allows to get the business nit. <br>
	* @return The business nit
	*/
	public int getNit(){
		return nit;
	}


	/**
	* Allows to change the business nit. <br>
	* <b>post:</b> The business nit is changed. 
	* @param nit The business nit
	*/
	public void setNit(int nit){
		this.nit = nit;
	}


	/**
	* Allows to get the business address. <br>
	* @return The business address
	*/
	public String getAddress(){
		return address;
	}

	/**
	* Allows to change the business address. <br>
	* <b>post:</b> The business address is changed. 
	* @param address The business address
	*/

	public void setAddress(String address){
		this.address = address;
	}


	/**
	* Allows to get the business phone. <br>
	* @return The business phone
	*/
	public String getPhone(){
		return phone;
	}


	/**
	* Allows to change the business phone. <br>
	* <b>post:</b> The business phone is changed. 
	* @param phone The business phone
	*/
	public void setPhone(String phone){
		this.phone = phone;
	}


	/**
	* Allows to get the business quantity of employees. <br>
	* @return The business quantity of employees
	*/
	public int getQuantityEmployees(){
		return quantityEmployees;
	}


	/**
	* Allows to change the business quantity of employees. <br>
	* <b>post:</b> The business quantity of employees is changed. 
	* @param quantityEmployees The business quantity of employees
	*/
	public void setQuantityEmployees(int quantityEmployees){
		this.quantityEmployees = quantityEmployees;
	}
	

	/**
	* Allows to get the business assets in COP. <br>
	* @return The business assets in COP
	*/
	public double getAssetsCop(){
		return assetsCop;
	}


	/**
	* Allows to change the business assets in COP. <br>
	* <b>post:</b> The business assets in COP is changed. 
	* @param assetsCop The business assets in COP
	*/
	public void setAssetsCop(double assetsCop){
		this.assetsCop = assetsCop;
	}



	/**
	* Allows to get the business constitution date. <br>
	* @return The business constitution date
	*/
	public DateIn getOpeningDate(){
		return openingDate;
	}
	

	/**
	* Allows to change the business constitution date. <br>
	* <b>post:</b> The business constitution date is changed. 
	* @param openingDate The business constitution date
	*/
	public void setOpeningDate(DateIn openingDate){
		this.openingDate = openingDate;
	}


	/**
	* Allows to get the business type of organization. <br>
	* @return The business type of organization
	*/
	public String getTypeOfOrganization(){
		return typeOfOrganization;
	}


	/**
	* Allows to change the business type of organization. <br>
	* <b>post:</b> The business type of organization is changed. 
	* @param typeOfOrganization The business type of organization
	*/
	public void setTypeOfOrganization(String typeOfOrganization){
		this.typeOfOrganization = typeOfOrganization;
	}


	/**
	* Allows to get the business legal representative's name. <br>
	* @return The business legal representative's name
	*/
	public String getLegalGuardiansName(){
		return legalGuardiansName;
	}

	/**
	* Allows to change the business legal representative's name. <br>
	* <b>post:</b> The business legal representative's name is changed. 
	* @param legalGuardiansName The business legal representative's name
	*/
	public void setLegalGuardiansName(String legalGuardiansName){
		this.legalGuardiansName = legalGuardiansName;
	}


	/**
	* Allows to get the business building made of cubicles. <br>
	* @return The business building
	*/
	public Cubicle[][] getCubicles(){
		return cubicles;
	}


	/**
	* Allows to change the business building made of cubicles. <br>
	* <b>post:</b> The business legal building is changed. 
	* @param cubicles The business building made of cubicles
	*/
	public void setCubicles(Cubicle[][] cubicles){
		this.cubicles = cubicles;
	}


	/**
	* Business informatiom such as name, nit, address, phone number, quantity of employees, assets in COP, type of organization, legal representative's name,
	* constitution date and its building info is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing business <br>
	* @see DateIn.convertDateToString()
	* @return The information of a business in a format to be shown to the final user
	*/
	public String toString(){
		String reply = "\n";
			   reply += "\n";
		       reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "| **************************************** BUSINESS BASIC INFORMATION *************************************** +\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "|\n";
			   reply += "| Business name: "+name+"\n";
			   reply += "| Business nit: "+nit+"\n";
			   reply += "| Business address: "+address+"\n";
			   reply += "| Business phone: "+phone+"\n";
			   reply += "| Number of employees: "+quantityEmployees+"\n";
			   reply += "| Business assets(COP): "+assetsCop+"\n";
			   reply += "| Type of organization: "+typeOfOrganization+"\n";
			   reply += "| Legal representative: "+legalGuardiansName+"\n";
			   reply += "| Constitution date: "+openingDate.convertDateToString()+"\n";
			   reply += "|\n";
			   reply += "| Business bulding has "+cubicles.length+" floors, and "+cubicles[0].length+" cubicles per floor\n";
			   reply += "| Total cubicles: "+ cubicles.length*cubicles[0].length +"\n";
			   reply += "|\n";
			   reply += "|\n";
			   
			   

		return reply;
	}

} //end of class