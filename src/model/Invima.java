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

	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}

	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration = sanitaryRegistration;
	}


	public boolean getStatus(){
		return status;
	}

	public void setStatus(boolean status){
		this.status = status;
	}


	public String getMode(){
		return mode;
	}

	public void setMode(String mode){
		this.mode = mode;
	}


	public DateIn getDateExpiration(){
		return dateExpiration;
	}

	public void setDateExpiration(DateIn dateExpiration){
		this.dateExpiration = dateExpiration;
	}

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