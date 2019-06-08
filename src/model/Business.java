/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 4 JUNE 2019
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
	private ArrayList<Survey> surveys;

	//METHODS

	public Business (String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys) {

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
		this.surveys = surveys;
	}


	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public int getNit(){
		return nit;
	}

	public void setNit(int nit){
		this.nit = nit;
	}


	public String getAddress(){
		return address;
	}

	public void setAddress(String address){
		this.address = address;
	}


	public String getPhone(){
		return phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}


	public int getQuantityEmployees(){
		return quantityEmployees;
	}

	public void setQuantityEmployees(int quantityEmployees){
		this.quantityEmployees = quantityEmployees;
	}
	
	public double getAssetsCop(){
		return assetsCop;
	}

	public void setAssetsCop(double assetsCop){
		this.assetsCop = assetsCop;
	}


	public DateIn getOpeningDate(){
		return openingDate;
	}
	
	public void setOpeningDate(DateIn openingDate){
		this.openingDate = openingDate;
	}


	public String getTypeOfOrganization(){
		return typeOfOrganization;
	}

	public void setTypeOfOrganization(String typeOfOrganization){
		this.typeOfOrganization = typeOfOrganization;
	}


	public String getLegalGuardiansName(){
		return legalGuardiansName;
	}

	public void setLegalGuardiansName(String legalGuardiansName){
		this.legalGuardiansName = legalGuardiansName;
	}


	public Cubicle[][] getCubicles(){
		return cubicles;
	}

	public void setCubicles(Cubicle[][] cubicles){
		this.cubicles = cubicles;
	}


	public String addSurvey(Survey survey){
		surveys.add(survey);

		return "New survey has been added to "+name;
	}


	public double customersAverageSatisfaction(){
		double average = -1;
		int sum = 0;

		if (surveys.size() >= 10 && surveys.size() <= 50) {

			for (int i = 0; i<surveys.size(); i++ ) {
			Survey survey = surveys.get(i);

			sum += survey.getQuestionA();
			sum += survey.getQuestionB();
			sum += survey.getQuestionC();
			}

			average = sum / surveys.size();

		} 
		
		return average;
	}

} //end of class