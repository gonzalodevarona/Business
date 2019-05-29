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
import java.util.ArrayList;

public class Holding{

	//ATTRIBUTES
	private String name;
	private String code;

	//RELATIONSHIPS
	private ArrayList<Business> businesses;

	public Holding(String name, String owner){
		this.name = name;
		this.owner = owner;
		businesses = new ArrayList<Business>();
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getOwner(){
		return owner;
	}

	public void setOwner(String owner){
		this.owner = owner;
	}

	public int businessesCounter(int selection){
		int many = 0;

		switch (selection) {
			case 0: 
				many = businesses.size();
				break;
				
			
			
		}


		return many;
	}



	public String showBusinessesInfo(){
		String info = "";

		for (int i = 0;i < businesses.size()  ;i++ ) {
			Business businessInMatter = businesses.get(i);

			if(businessInMatter instanceof Education){
				Education businessE = (Education)businessInMatter;
				info += businessE.getMyInfo();
			}
				else if(businessInMatter instanceof Manufacturing){
					Manufacturing businessM = (Manufacturing)businessInMatter;
					info += businessM.getMyInfo();
				}
					else if(businessInMatter instanceof Technological){
						Technological businessT = (Technological)businessInMatter;
						info += businessT.getMyInfo();
					}

				
		}

		return info;
	}


} //end of class