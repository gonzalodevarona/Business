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

public class Invima{


	public final static String MAE = "Manufacture and export";
	public final static String MAS = "Manufacture and sell";
	public final static String IAS = "Import and sell";


	//ATTRIBUTES

	private String sanitaryRegistration;
	private boolean status;
	private String mode;


	//RELATIONSHIPS

	private DateIn dateExpiration;


	//METHODS

	public Invima(String sanitaryRegistration, boolean status, String mode, DateIn dateExpiration){
		this.sanitaryRegistration = sanitaryRegistration;
		this.status = status;
		this.mode = mode;
		this.dateExpiration = dateExpiration;
	}

	/**
	* Allows to get the Invimas's sanitary registration. <br>
	* @return The Invimas's sanitary registration
	*/

	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}


	/**
	* Allows to change the Invimas's sanitary registration. <br>
	* <b>post:</b> The Invimas's sanitary registration is changed. 
	* @param sanitaryRegistration The Invimas's sanitary registration
	*/
	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration = sanitaryRegistration;
	}


	/**
	* Allows to get the Invimas's status. <br>
	* @return The Invimas's status
	*/
	public boolean getStatus(){
		return status;
	}


	/**
	* Allows to change the Invimas's status. <br>
	* <b>post:</b> The Invimas's status is changed. 
	* @param status The Invimas's status
	*/

	public void setStatus(boolean status){
		this.status = status;
	}


	/**
	* Allows to get the Invimas's mode. <br>
	* @return The Invimas's mode
	*/
	public String getMode(){
		return mode;
	}

	/**
	* Allows to change the Invimas's mode. <br>
	* <b>post:</b> The Invimas's mode is changed. 
	* @param mode The Invimas's mode
	*/
	public void setMode(String mode){
		this.mode = mode;
	}


	/**
	* Allows to get the Invimas's expiration date. <br>
	* @return The Invimas's expiration date
	*/
	public DateIn getDateExpiration(){
		return dateExpiration;
	}


	/**
	* Allows to change the Invimas's expiration date. <br>
	* <b>post:</b> The Invimas's expiration date is changed. 
	* @param dateExpiration The Invimas's expiration date
	*/
	public void setDateExpiration(DateIn dateExpiration){
		this.dateExpiration = dateExpiration;
	}

	/**
	* Invimas's informatiom such as product's sanitary registration, active or expired, mode and expiration date
	* is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing Invima certificate <br>
	* @return The information of a product's Invima in a format to be shown to the final user
	*/

	public String toString(){
	String reply  = "|\n";
	       reply += "| INVIMA\n";
		   reply += "| Product's sanitary registration: "+sanitaryRegistration+"\n";
		   reply += "| Active: "+status+"\n";
		   reply += "| Mode: "+mode+"\n";
		   reply += "| Expiration date: "+dateExpiration.convertDateToStringMY()+"\n";
		   reply += "|\n";
		   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
		   reply += "|\n";
		return reply;
	}


} //end of class