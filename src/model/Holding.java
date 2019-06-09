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
import java.util.ArrayList;

public class Holding{

	//ATTRIBUTES
	private String name;
	private String owner;

	//RELATIONSHIPS
	private ArrayList<Business> businesses;
	private Cubicle[][] building;

	public Holding(String name, String owner, Cubicle[][] building){
		this.name = name;
		this.owner = owner;
		this.building = building;
		businesses = new ArrayList<Business>();
	}

	/**
	* Allows to get the holding's name. <br>
	* @return The holding's name
	*/

	public String getName(){
		return name;
	}


	/**
	* Allows to change the holding's name. <br>
	* <b>post:</b> The holding's name is changed. 
	* @param name The holding's name
	*/

	public void setName(String name){
		this.name = name;
	}


	/**
	* Allows to get the holding owner's name. <br>
	* @return The holding owner's name
	*/
	public String getOwner(){
		return owner;
	}


	/**
	* Allows to change the holding owner's name. <br>
	* <b>post:</b> The holding owner's name is changed. 
	* @param owner The holding owner's name
	*/

	public void setOwner(String owner){
		this.owner = owner;
	}


	/**
	* Allows to add a business to the holding company.  <br>
	* <b>post:</b> The business is added to the holding company.
	* @param business The business to be added 
	* @return A confirmation message
	*/

	public String addBusiness(Business business){
		businesses.add(business);

		return "New business has been added to "+name+" holding";
	}


	public Business findBusiness(int nit){
		Business found = null;
		boolean stop = false;

		for (int i = 0;i<businesses.size() && !stop ;i++ ) {
			if (businesses.get(i).getNit() == nit) {
				stop = true;

				found = businesses.get(i);
				
			}
		}

		return found;
	}


	public int businessCounter(){
		int numberOfBusinesses = businesses.size();
		return numberOfBusinesses;
	}


	public String showAllBusinesses(){
		String reply = "";

		for (int i = 0;i<businesses.size() ;i++ ) {

			Business businessInMatter = businesses.get(i);

			if (businessInMatter instanceof Education) {
				Education businessInMatterE = (Education) businessInMatter;
				reply += businessInMatterE.toString();

			} else if (businessInMatter instanceof Public) {
				Public businessInMatterP = (Public) businessInMatter;
				reply += businessInMatterP.toString();

			} else if (businessInMatter instanceof Technological) {
				Technological businessInMatterT = (Technological) businessInMatter;
				reply += businessInMatterT.toString();

			} else{
				Manufacturing businessInMatterM = (Manufacturing) businessInMatter;
				reply += businessInMatterM.toString();

			}

			
		}

		return reply;
	}

	public String findExtension(Business found, int letter, String name, String email){
		String extension = "";
		boolean stop = false;
		Cubicle[][] building = found.getCubicles();

		int minor = building.length;
		if(building[0].length<minor){
			minor = building[0].length;
		}

		int c = 0;
		int d = building[0].length-1;

		//LZXOE
		switch (letter) {
				case 1: 
					for (int i = 0; i<building.length && !stop ; i++ ) {
						if(building[i][0].getName().equalsIgnoreCase(name) && building[i][0].getEmail().equalsIgnoreCase(email)){
							extension = building[i][0].getExtension();
							stop = true;

						}
					
					}

					for (int j = 0; j<building[0].length && !stop ; j++ ) {
						if(building[building.length-1][j].getName().equalsIgnoreCase(name) && building[building.length-1][j].getEmail().equalsIgnoreCase(email)){
							extension = building[building.length-1][j].getExtension();
							stop = true;
						}
					
					}

					break;


				case 2:
					for (int b = 0; b<building[0].length && !stop ; b++ ) {
						if(building[0][b].getName().equalsIgnoreCase(name) && building[0][b].getEmail().equalsIgnoreCase(email)){
							extension = building[0][b].getExtension();
							stop = true;
						}
					}


					while (c<minor && d>=0 && !stop) {

						if(building[c][d].getName().equalsIgnoreCase(name) && building[c][d].getEmail().equalsIgnoreCase(email)){
							extension = building[c][d].getExtension();
							stop = true;
						}

						c++;
						d--;
						
					}

					for (int a = 0; a<building[0].length && !stop ; a++ ) {
						if(building[building.length-1][a].getName().equalsIgnoreCase(name) && building[building.length-1][a].getEmail().equalsIgnoreCase(email)){
							extension = building[building.length-1][a].getExtension();
							stop = true;
						}
					}

					
					break;
				case 3:

					while (c<minor && d>=0 && !stop) {

						if(building[c][d].getName().equalsIgnoreCase(name) && building[c][d].getEmail().equalsIgnoreCase(email)){
							extension = building[c][d].getExtension();
							stop = true;
						}

						c++;
						d--;
						
					}

					c = 0;

					while (c<minor && !stop) {

						if(building[c][c].getName().equalsIgnoreCase(name) && building[c][c].getEmail().equalsIgnoreCase(email)){
							extension = building[c][c].getExtension();
							stop = true;
						}

						c++;
						
					}

					break;
				case 4:

					for (int b = 0; b<building[0].length && !stop ; b++ ) {
						if(building[0][b].getName().equalsIgnoreCase(name) && building[0][b].getEmail().equalsIgnoreCase(email)){
							extension = building[0][b].getExtension();
							stop = true;
						}
					}


					for (int i = 0; i<building.length && !stop ; i++ ) {
						if(building[i][0].getName().equalsIgnoreCase(name) && building[i][0].getEmail().equalsIgnoreCase(email)){
							extension = building[i][0].getExtension();
							stop = true;

						}
					
					}

					for (int j = 0; j<building[0].length && !stop ; j++ ) {
						if(building[building.length-1][j].getName().equalsIgnoreCase(name) && building[building.length-1][j].getEmail().equalsIgnoreCase(email)){
							extension = building[building.length-1][j].getExtension();
							stop = true;
						}
					
					}

					for (int a = 0; a<building.length && !stop ; a++ ) {
						if(building[a][building[0].length-1].getName().equalsIgnoreCase(name) && building[a][building[0].length-1].getEmail().equalsIgnoreCase(email)){
							extension = building[a][building[0].length-1].getExtension();
							stop = true;

						}
					
					}

					break;
				
				case 5:
					if (building.length % 2 != 0) {
						for (int i = 0;i<building.length && !stop ;i++ ) {

						if (i%2 == 0) {
							for (int j = 0;j< building[0].length && !stop;j++ ) {
								if(building[i][j].getName().equalsIgnoreCase(name) && building[i][j].getEmail().equalsIgnoreCase(email)){
									extension = building[i][j].getExtension();
									stop = true;

								}
							}
						
						} else {
							for (int k = building[0].length-1; k>= 0 && !stop;k-- ) {
								if(building[i][k].getName().equalsIgnoreCase(name) && building[i][k].getEmail().equalsIgnoreCase(email)){
									extension = building[i][k].getExtension();
									stop = true;

								}
							}
						  }
						
						}
					}
					
					break;
				default: 
					break;
					
				
				
		}

		return extension;

	}


	public String findEmails(Business found, String position){
		String emails = "";

		Cubicle[][] building = found.getCubicles();

		int minor = building.length;
		if(building[0].length<minor){
			minor = building[0].length;
		}

		int c = 0;
		int d = building[0].length-1;

		return emails;
	}


} //end of class