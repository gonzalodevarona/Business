/**
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 * ID
 * UNIVERSIDAD ICESI (CALI-COLOMBIA)
 * DEPARTAMENTO TIC - ALGORTIMOS Y PROGRAMACIÓN I
 * LAB FOR HOLDING BUSINESS
 * @author: GONZALO DE VARONA <gonzalo.de1@correo.icesi.edu.co>
 * @version: 7 JUNE 2019
 * ˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜˜
 */

package model;

public class Survey{

	//ATTRIBUTES
	private int questionA;
	private int questionB;
	private int questionC;


	public Survey(int questionA, int questionB, int questionC){
		this.questionA = questionA;
		this.questionB = questionB;
		this.questionC = questionC;
	}


	/**
	* Allows to get the question A answer. <br>
	* @return The question A answer
	*/

	public int getQuestionA(){
		return questionA;
	}


	/**
	* Allows to change question A answer. <br>
	* <b>post:</b> The question A answer is changed. 
	* @param questionA The question A answer
	*/
	public void setQuestionA(int questionA){
		this.questionA = questionA;
	}


	/**
	* Allows to get the question B answer. <br>
	* @return The question B answer
	*/
	public int getQuestionB(){
		return questionB;
	}


	/**
	* Allows to change question B answer. <br>
	* <b>post:</b> The question B answer is changed. 
	* @param questionB The question B answer
	*/
	public void setQuestionB(int questionB){
		this.questionB = questionB;
	}


	/**
	* Allows to get the question C answer. <br>
	* @return The question C answer
	*/


	public int getQuestionC(){
		return questionC;
	}

	/**
	* Allows to change question C answer. <br>
	* <b>post:</b> The question C answer is changed. 
	* @param questionC The question C answer
	*/
	public void setQuestionC(int questionC){
		this.questionC = questionC;
	}





} //end of class