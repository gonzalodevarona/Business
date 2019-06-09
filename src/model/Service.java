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

public class Service extends Business{

	//RELATIONSHIPS

	private ArrayList<Survey> surveys;

	public Service(String name, int nit, String address, String phone, int quantityEmployees, double assetsCop, 
	DateIn openingDate, String typeOfOrganization, String legalGuardiansName, Cubicle[][] cubicles, ArrayList<Survey> surveys){
		super(name, nit, address, phone, quantityEmployees, assetsCop, openingDate, typeOfOrganization, legalGuardiansName, cubicles);
		this.surveys = surveys;
	}

	/**
	* Allows to add a survey to a services business.  <br>
	* <b>post:</b> A survey is added to a services business.  
	* @param survey A survey to be added 
	* @return A confirmation message
	*/

	public String addSurvey(Survey survey){
	surveys.add(survey);

	return "New survey has been added to "+super.getName();
	}


	/**
	* Service business informatiom such total surveys and average satisfaction indicator is organized in a format so it can be shown to the final user<br>
	* <b>pre:</b> This method must be invocated over an existing service business <br>
	* @see customersAverageSatisfaction()
	* @see Business.toString()
	* @return The information of a service business in a format to be shown to the final user
	*/

	public String toString(){

	 String reply = super.toString();
			reply += "+-------------------------------------------------------------------------------------------------------------+\n";
			reply += "| ************************************** SERVICES BUSINESS INFORMATION ************************************** +\n";
			reply += "+-------------------------------------------------------------------------------------------------------------+\n";   
			reply += "|\n";
		    reply += "| Total surveys: "+ surveys.size()+"\n";
		    reply += "| Average satisfaction indicator: "+ customersAverageSatisfaction()+". (If it is -1 means there aren't enough surveys to make the calculus)\n";
		    reply += "|\n";

		    return reply;
	}
	
	/**
	* This method calculates the average satisfaction indicator by adding every answer of every question together and diving it by the total amount of surveys.<br>
	* <b>pre:</b> This method must be invocated over an existing service business <br>
	* @see Survey.getQuestionA()
	* @see Survey.getQuestionB()
	* @see Survey.getQuestionC()
	* @return The average satisfaction indicator
	*/

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