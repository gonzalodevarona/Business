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

public class Technological extends Service{


	//ATTRIBUTES
	//ALL THIS ATTRIUTES BELOW REFFER OF HOW MANY TIMES DOES A SERVICE OF EACH TYPE HAD BEEN RENDERED
	private int consulting;
	private int training;
	private int softwareDevelopment;
	private int infrastructureService;
	private int softwareService;
	private int platformService;


	//METHODS
	public Technological(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, int consulting, int training, int softwareDevelopment, int infrastructureService,
	int softwareService, int platformService){
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName);
		this.consulting = consulting;
		this.training = training;
		this.softwareDevelopment = softwareDevelopment;
		this.infrastructureService = infrastructureService;
		this.softwareService = softwareService;
		this.platformService = platformService;
	}



	public int getConsulting(){
		return consulting;
	}

	public void setConsulting(int consulting){
		this.consulting = consulting;
	}


	public int getTraining(){
		return training;
	}

	public void setTraining(int training){
		this.training = training;
	}


	public int getSoftwareDevelopment(){
		return softwareDevelopment;
	}

	public void setSoftwareDevelopment(int softwareDevelopment){
		this.softwareDevelopment = softwareDevelopment;
	}


	public int getInfrastructureService(){
		return infrastructureService;
	}

	public void setInfrastructureService(int infrastructureService){
		this.infrastructureService = infrastructureService;
	}


	public int getSoftwareService(){
		return softwareService;
	}

	public void setSoftwareService(int softwareService){
		this.softwareService = softwareService;
	}


	public int getPlatformService(){
		return platformService;
	}

	public void setPlatformService(int platformService){
		this.platformService = platformService;
	}




} //end of class