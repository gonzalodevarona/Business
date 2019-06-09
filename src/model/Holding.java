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
						if(building[i][0].getName().equals(name) && building[i][0].getEmail().equals(email)){
							extension = building[i][0].getExtension();
							stop = true;

						}
					
					}

					for (int j = 0; j<building[0].length && !stop ; j++ ) {
						if(building[building.length-1][j].getName().equals(name) && building[building.length-1][j].getEmail().equals(email)){
							extension = building[building.length-1][j].getExtension();
							stop = true;
						}
					
					}

					break;


				case 2:
					for (int b = 0; b<building[0].length && !stop ; b++ ) {
						if(building[0][b].getName().equals(name) && building[0][b].getEmail().equals(email)){
							extension = building[0][b].getExtension();
							stop = true;
						}
					}


					while (c<minor && d>=0 && !stop) {

						if(building[c][d].getName().equals(name) && building[c][d].getEmail().equals(email)){
							extension = building[c][d].getExtension();
							stop = true;
						}

						c++;
						d--;
						
					}

					for (int a = 0; a<building[0].length && !stop ; a++ ) {
						if(building[building.length-1][a].getName().equals(name) && building[building.length-1][a].getEmail().equals(email)){
							extension = building[building.length-1][a].getExtension();
							stop = true;
						}
					}

					
					break;
				case 3:

					while (c<minor && d>=0 && !stop) {

						if(building[c][d].getName().equals(name) && building[c][d].getEmail().equals(email)){
							extension = building[c][d].getExtension();
							stop = true;
						}

						c++;
						d--;
						
					}

					c = 0;

					while (c<minor && !stop) {

						if(building[c][c].getName().equals(name) && building[c][c].getEmail().equals(email)){
							extension = building[c][c].getExtension();
							stop = true;
						}

						c++;
						
					}

					break;
				case 4:

					for (int b = 0; b<building[0].length && !stop ; b++ ) {
						if(building[0][b].getName().equals(name) && building[0][b].getEmail().equals(email)){
							extension = building[0][b].getExtension();
							stop = true;
						}
					}


					for (int i = 0; i<building.length && !stop ; i++ ) {
						if(building[i][0].getName().equals(name) && building[i][0].getEmail().equals(email)){
							extension = building[i][0].getExtension();
							stop = true;

						}
					
					}

					for (int j = 0; j<building[0].length && !stop ; j++ ) {
						if(building[building.length-1][j].getName().equals(name) && building[building.length-1][j].getEmail().equals(email)){
							extension = building[building.length-1][j].getExtension();
							stop = true;
						}
					
					}

					for (int a = 0; a<building.length && !stop ; a++ ) {
						if(building[a][building[0].length-1].getName().equals(name) && building[a][building[0].length-1].getEmail().equals(email)){
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
								if(building[i][j].getName().equals(name) && building[i][j].getEmail().equals(email)){
									extension = building[i][j].getExtension();
									stop = true;

								}
							}
						
						} else {
							for (int k = building[0].length-1; k>= 0 && !stop;k-- ) {
								if(building[i][k].getName().equals(name) && building[i][k].getEmail().equals(email)){
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