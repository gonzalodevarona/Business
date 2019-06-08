/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 29 MAY 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;
import java.util.*;


public class Public extends Service implements Taxable{

	public final static String SEWERAGE= "Sewerage";
	public final static String ENERGY = "Energy";
	public final static String AQUEDUCT = "Aqueduct";

	//ATTRIBUTES
	private String serviceType;
	private int totalSubscribers;
	private int subscribers1N2;


	public Public(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys, String serviceType, int totalSubscribers, int subscribers1N2){
		
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles, surveys);
		this.serviceType = serviceType;
		this.totalSubscribers = totalSubscribers;
		this.subscribers1N2 = subscribers1N2;
	}

	public String getServiceType(){
		return serviceType;
	}

	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}


	public int getTotalSubscribers(){
		return totalSubscribers;
	}

	public void setTotalSubscribers(int totalSubscribers){
		this.totalSubscribers = totalSubscribers;
	}

	public int getSubscribers1N2(){
		return subscribers1N2;
	}

	public void setSubscribers1N2(int subscribers1N2){
		this.subscribers1N2 = subscribers1N2;
	}

	public double procultura(){
		double tax = totalSubscribers - subscribers1N2;
		tax = 40 - tax;

		if (tax < 0) {
			tax = 0;
		}

		return tax;
	}


	@Override
	public String toString(){

		String reply = super.toString();
		       reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "| *********************************** PUBLIC SERVICES BUSINESS INFORMATION ********************************** +\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "|\n";
			   reply += "| Service type: "+serviceType+"\n";
			   reply += "| Total subscribers: "+totalSubscribers+"\n";
			   reply += "| Total subscribers from 1 and 2 stratums:  "+subscribers1N2+"\n";
			   reply += "| Procultura tax: "+procultura()+" COP\n";
			   reply += "|\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "\n";
			   

		return reply;
	
	}





} //end of class