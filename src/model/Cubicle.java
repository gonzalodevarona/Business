/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 9 JUNE 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class Cubicle{

	//ATTRIBUTES
	private String name;
	private String position;
	private String email;
	private String extension;


	public Cubicle(String name, String position, String email, String extension){
		this.name = name;
		this.position = position;
		this.email = email;
		this.extension = extension;
	}

	/**
	* Allows to get the cubicle employee's name. <br>
	* @return The cubicle employee's name
	*/

	public String getName(){
		return name;
	}


	/**
	* Allows to change the cubicle employee's name. <br>
	* <b>post:</b> The cubicle employee's name is changed. 
	* @param name The cubicle employee's name
	*/

	public void setName(String name){
		this.name = name;
	}


	/**
	* Allows to get the cubicle employee's position. <br>
	* @return The cubicle employee's position
	*/
	public String getPosition(){
		return position;
	}


	/**
	* Allows to change the cubicle employee's position. <br>
	* <b>post:</b> The cubicle employee's position is changed. 
	* @param position The cubicle employee's position
	*/
	public void setPosition(String position){
		this.position = position;
	}


	/**
	* Allows to get the cubicle employee's email. <br>
	* @return The cubicle employee's email
	*/
	public String getEmail(){
		return email;
	}

	/**
	* Allows to change the cubicle employee's email. <br>
	* <b>post:</b> The cubicle employee's email is changed. 
	* @param email The cubicle employee's email
	*/

	public void setEmail(String email){
		this.email = email;
	}


	/**
	* Allows to get the cubicle's extension. <br>
	* @return The cubicle's extension
	*/
	public String getExtension(){
		return extension;
	}

	/**
	* Allows to change the cubicle's extension. <br>
	* <b>post:</b> The cubicle's extension is changed. 
	* @param extension The cubicle's extension
	*/
	public void setExtension(String extension){
		this.extension = extension;
	}





} //end of class