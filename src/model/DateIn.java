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

public class DateIn {
	
	//ATTRIBUTES
	private int day;
	private int month;
	private int year;


	//METHODS

	/**
	* Constructor method for class DateIn which is a gregorian date. <br>
	* @param day The number of the day of a date. This param must be greater than zero.
	* @param month The number of the month of a date. This param must be greater than zero.
	* @param year The number of the year of a date. This param must be greater or equal to zero.
	*/

	public DateIn(int day, int month, int year){
	this.day = day;
	this.month = month;
	this.year = year;
	}


	/**
	* Allows to get the number of the day of a date. <br>
	* @return The number of the day of a date.
	*/

	public  int getDay() {
		return day;
	}

	/**
	* Allows to change the number of the day of a date. <br>
	* <b>post:</b> The number of the day of a date is changed.
	* @param day The number of the day of a date. This param must be greater than zero.
	*/

	public void setDay(int day) {
		this.day = day;
	}


	/**
	* Allows to get the number of the month of a date. <br>
	* @return The number of the month of a date.
	*/

	public  int getMonth() {
		return month;
	}


	/**
	* Allows to change the number of the month of a date. <br>
	* <b>post:</b> The number of the month of a date is changed.
	* @param month The number of the month of a date. This param must be greater than zero.
	*/

	public void setMonth(int month) {
		this.month = month;
	}


	/**
	* Allows to get the number of the year of a date. <br>
	* @return The number of the year of a date.
	*/

	public  int getYear() {
		return year;
	}


	/**
	* Allows to change the number of the year of a date. <br>
	* <b>post:</b> The number of the year of a date is changed.
	* @param  year The number of the year of a date. This param must be greater or equal to zero.
	*/

	public void setYear(int year) {
		this.year = year;
	}


	/**
	* Allows to get a date as a String in the format: DD/MM/YY. <br>
	* @return A date in the format: DD/MM/YY.
	*/

	public String convertDateToString(){
		String aDate = "";
		aDate += Integer.toString(day);
		aDate += "/";
		aDate += Integer.toString(month);
		aDate += "/";
		aDate += Integer.toString(year);
		return aDate;
	}

	public int calculateDayOfTheYear(){
		return (month * 30 - (day-30));
	}

	public String convertDateToStringMY(){
		String aDate = "";
		aDate += Integer.toString(month);
		aDate += "/";
		aDate += Integer.toString(year);
		return aDate;
	}
	
	

	

} //end of class
