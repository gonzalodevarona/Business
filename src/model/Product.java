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

public class Product{


	//ATTRIBUTES
	
	private String name;
	private String code;
	private double waterRequired4Manufacturing;
	private int unitsInventory;

	//RELATIONSHIPS

	private Invima invima;


	//METHODS
	public Product(String name, String code, double waterRequired4Manufacturing, int unitsInventory, Invima invima){
		this.name = name;
		this.code = code;
		this.waterRequired4Manufacturing = waterRequired4Manufacturing;
		this.unitsInventory = unitsInventory;
		this.invima = invima;

	}


	/**
	* Allows to get the product's name. <br>
	* @return The product's name
	*/

	public String getName(){
		return name;
	}


	/**
	* Allows to change the product's name. <br>
	* <b>post:</b> The product's name is changed. 
	* @param name The product's name
	*/

	public void setName(String name){
		this.name = name;
	}



	/**
	* Allows to get the product's code. <br>
	* @return The product's code
	*/
	public String getCode(){
		return code;
	}


	/**
	* Allows to change the product's code. <br>
	* <b>post:</b> The product's code is changed. 
	* @param code The product's code
	*/
	public void setCode(String code){
		this.code = code;
	}

	/**
	* Allows to get the product's quantity of water needed for manufacture. <br>
	* @return The product's quantity of water needed for manufacture
	*/
	public double getWaterRequired4Manufacturing(){
		return waterRequired4Manufacturing;
	}


	/**
	* Allows to change the product's quantity of water needed for manufacture. <br>
	* <b>post:</b> The product's quantity of water needed for manufacture is changed. 
	* @param waterRequired4Manufacturing The product's quantity of water needed for manufacture
	*/
	public void setWaterRequired4Manufacturing(double waterRequired4Manufacturing){
		this.waterRequired4Manufacturing = waterRequired4Manufacturing;
	}


	/**
	* Allows to get the product's units in inventory. <br>
	* @return The product's units in inventory
	*/
	public int getUnitsInventory(){
		return unitsInventory;
	}


	/**
	* Allows to change the product's units in inventory. <br>
	* <b>post:</b> The product's units in inventory are changed. 
	* @param unitsInventory The product's units in inventory
	*/
	public void setUnitsInventory(int unitsInventory){
		this.unitsInventory = unitsInventory;
	}


	/**
	* Allows to get the product's Invima certificate. <br>
	* @return The product's Invima certificate
	*/
	public Invima getInvima(){
		return invima;
	}


	/**
	* Allows to change the product's Invima certificate. <br>
	* <b>post:</b> The product's Invima certificate is changed. 
	* @param invima The product's Invima certificate
	*/
	public void setInvima(Invima invima){
		this.invima = invima;
	}


	/**
	* Product's informatiom such as name, code, water required for manufacturing and units in inventory and its invima's info 
	* is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing product <br>
	* @see Invima.toString()
	* @return The information of a product in a format to be shown to the final user
	*/
	public String toString(){
    String reply  = "|\n";
		   reply += "| Product's name: "+name+"\n";
		   reply += "| Product's code: "+code+"\n";
		   reply += "| Water required for manufacture: "+waterRequired4Manufacturing+" litres\n";
		   reply += "| Units in inventory: "+unitsInventory+" COP\n";
		   reply += "|\n";
		   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
		 if (invima != null) {
		 	reply += invima.toString();
		 }
			   

		return reply;

	}




} //end of class