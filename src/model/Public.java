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

	/**
	* Allows to get the service business service type. <br>
	* @return The service business service type
	*/

	public String getServiceType(){
		return serviceType;
	}


	/**
	* Allows to change the service business service type. <br>
	* <b>post:</b> The service business service type is changed. 
	* @param serviceType The service business service type.
	*/

	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}


	/**
	* Allows to get the service business amount of subscribers. <br>
	* @return The service business amount of subscribers
	*/

	public int getTotalSubscribers(){
		return totalSubscribers;
	}


	/**
	* Allows to change the service business amount of subscribers. <br>
	* <b>post:</b> The service business amount of subscribers is changed. 
	* @param totalSubscribers The service business amount of subscribers
	*/
	public void setTotalSubscribers(int totalSubscribers){
		this.totalSubscribers = totalSubscribers;
	}

	/**
	* Allows to get the service business amount of subscribers from 1 and 2 stratums. <br>
	* @return The service business amount of subscribers from 1 and 2 stratums
	*/

	public int getSubscribers1N2(){
		return subscribers1N2;
	}

	/**
	* Allows to change the service business amount of subscribers from 1 and 2 stratums. <br>
	* <b>post:</b> The service business amount of subscribers from 1 and 2 stratums is changed. 
	* @param subscribers1N2 The service business amount of subscribers from 1 and 2 stratums
	*/
	
	public void setSubscribers1N2(int subscribers1N2){
		this.subscribers1N2 = subscribers1N2;
	}

	public double procultura(){
		double tax = totalSubscribers - subscribers1N2;
		tax = tax * 100;
		tax = tax / totalSubscribers;
		tax = 40 - tax;

		if (tax < 0) {
			tax = 0;
		}

		return tax;
	}


	/**
	* Public services business informatiom such as service type, total subscribers, address, total subscribers from 1 and 2 stratums, and
	* procultura tax is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing business <br>
	* @see procultura()
	* @see Service.toString()
	* @return The information of a public services business in a format to be shown to the final user
	*/

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