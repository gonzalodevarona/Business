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

public class Technological extends Service{


	//ATTRIBUTES
	//ALL THIS ATTRIUTES BELOW REFFER OF HOW MANY TIMES DOES A SERVICE OF EACH TYPE HAD BEEN RENDERED
	private  double kilowatts;
	private int consulting;
	private int training;
	private int softwareDevelopment;
	private int infrastructureService;
	private int softwareService;
	private int platformService;


	//METHODS
	public Technological(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys, double kilowatts, int consulting, 
	int training, int softwareDevelopment, int infrastructureService,
	int softwareService, int platformService){
		
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles, surveys);
		this.kilowatts = kilowatts;
		this.consulting = consulting;
		this.training = training;
		this.softwareDevelopment = softwareDevelopment;
		this.infrastructureService = infrastructureService;
		this.softwareService = softwareService;
		this.platformService = platformService;
	}

	/**
	* Allows to calculate how many trees the manufacturing compnay has to plant because of its kilowatts consumption. <br>
	* @return The quantity of trees to be planted
	*/
	public int energyXtrees(){
		int trees = 0;

		if (kilowatts >= 1 && kilowatts <= 1000) {
		 	trees = trees + 8;
		} else if (kilowatts >= 1001 && kilowatts <= 3000) {
		 	trees = trees + 35;
		} else if (kilowatts < 3000) {
		 	trees = trees + 500;
		}

		return trees;
	}

	/**
	* Allows to get the technological business kilowatts consumed. <br>
	* @return The kilowatts consumed
	*/

	public double getKilowatts(){
		return kilowatts;
	}


	/**
	* Allows to change the technological business kilowatts consumed. <br>
	* <b>post:</b> The kilowatts consumed are changed. 
	* @param kilowatts The kilowatts consumed
	*/

	public void setKilowatts(double kilowatts){
		this.kilowatts = kilowatts;
	}


	/**
	* Allows to get how many times consulting service was rendered. <br>
	* @return Consulting services rendered
	*/

	public int getConsulting(){
		return consulting;
	}

	/**
	* Allows to change the consulting services rendered. <br>
	* <b>post:</b> The consulting services are changed. 
	* @param consulting The consulting services
	*/

	public void setConsulting(int consulting){
		this.consulting = consulting;
	}


	/**
	* Allows to get how many times training service was rendered. <br>
	* @return Training services rendered
	*/

	public int getTraining(){
		return training;
	}


	/**
	* Allows to change the training services rendered. <br>
	* <b>post:</b> The training services are changed. 
	* @param training The training services
	*/
	public void setTraining(int training){
		this.training = training;
	}


	public int getSoftwareDevelopment(){
		return softwareDevelopment;
	}


	/**
	* Allows to change the software development services rendered. <br>
	* <b>post:</b> The software development services are changed. 
	* @param softwareDevelopment The software development services
	*/

	public void setSoftwareDevelopment(int softwareDevelopment){
		this.softwareDevelopment = softwareDevelopment;
	}


	/**
	* Allows to get how many times infrastructure service was rendered. <br>
	* @return Infrastructure services rendered
	*/
	public int getInfrastructureService(){
		return infrastructureService;
	}


	/**
	* Allows to change the infrastructure services rendered. <br>
	* <b>post:</b> The infrastructure  services are changed. 
	* @param infrastructureService The infrastructure services
	*/
	public void setInfrastructureService(int infrastructureService){
		this.infrastructureService = infrastructureService;
	}

	/**
	* Allows to get how many times the software service was rendered. <br>
	* @return Software services rendered
	*/

	public int getSoftwareService(){
		return softwareService;
	}

	/**
	* Allows to change the software services rendered. <br>
	* <b>post:</b> The software services are changed. 
	* @param softwareService The software services
	*/
	public void setSoftwareService(int softwareService){
		this.softwareService = softwareService;
	}


	/**
	* Allows to get how many times the platform service was rendered. <br>
	* @return Platform services rendered
	*/
	public int getPlatformService(){
		return platformService;
	}


	/**
	* Allows to change the platform services rendered. <br>
	* <b>post:</b> The platform services are changed. 
	* @param platformService The platform services
	*/
	public void setPlatformService(int platformService){
		this.platformService = platformService;
	}

	/**
	* Technological business informatiom such as kilowatts, consulting, training, software development, infrastructure service, platform service, software service
	* and trees to be planted due to kilowatts consumption is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing technological business <br>
	* @see Service.toString()
	* @see energyXtrees()
	* @return The information of a technological business in a format to be shown to the final user
	*/

	@Override
	public String toString(){

		String reply = super.toString();
		       reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "| ************************************ TECHNOLOGICAL BUSINESS INFORMATION *********************************** +\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "|\n";
			   reply += "| Kilowatts consumed: "+kilowatts+"\n";
			   reply += "| Consulting services rendered: "+consulting+"\n";
			   reply += "| Training services rendered: "+training+"\n";
			   reply += "| Software development services rendered: "+softwareDevelopment+"\n";
			   reply += "| Infrastructure services rendered: "+infrastructureService+"\n";
			   reply += "| Software services rendered: "+softwareService+"\n";
			   reply += "| Platform services rendered: "+platformService+"\n";
			   reply += "| Trees that must be planted: "+energyXtrees()+"\n";
			   reply += "|\n";
			   reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			   reply += "\n";
			   

		return reply;
	
	}

} //end of class