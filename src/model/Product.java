/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 20 MAY 2019
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


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getCode(){
		return code;
	}

	public void setCode(String code){
		this.code = code;
	}


	public double getWaterRequired4Manufacturing(){
		return waterRequired4Manufacturing;
	}

	public void setWaterRequired4Manufacturing(double waterRequired4Manufacturing){
		this.waterRequired4Manufacturing = waterRequired4Manufacturing;
	}


	public int getUnitsInventory(){
		return unitsInventory;
	}

	public void setUnitsInventory(int unitsInventory){
		this.unitsInventory = unitsInventory;
	}

	public Invima getInvima(){
		return invima;
	}

	public void setInvima(Invima invima){
		this.invima = invima;
	}

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